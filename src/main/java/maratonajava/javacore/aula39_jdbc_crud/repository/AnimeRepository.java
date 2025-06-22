package maratonajava.javacore.aula39_jdbc_crud.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.aula39_jdbc_crud.conn.ConnectionFactory;
import maratonajava.javacore.aula39_jdbc_crud.domain.Anime;
import maratonajava.javacore.aula39_jdbc_crud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}", name);
        List<Anime> animeList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                animeList.add(Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build()
                );
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return animeList;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes , a.producer_id, p.name as 'producer_name' FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.id
                WHERE a.name like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = maratonajava.javacore.aula39_jdbc.conn.ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted produced '{}' in the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete Anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.anime WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime Anime) {
        log.info("Saving Animes '{}", Anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, Anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update Anime '{}'", Anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Anime Anime) throws SQLException {
        String sql = "INSERT INTO anime_store.anime (name, episodes, producer_id) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getProducer().getId());
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Animes by id '{}", id);
        List<Anime> animeList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer
                    .builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();
            return Optional.of(Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes , a.producer_id, p.name as 'producer_name' FROM anime_store.anime a
                INNER JOIN anime_store.producer p on a.producer_id = p.id
                WHERE a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Anime Anime) {
        log.info("Updating Anime '{}'", Anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, Anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update Anime '{}'", Anime.getId(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime Anime) throws SQLException {
        String sql = "UPDATE anime SET name = ?, episodes = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getId());
        return ps;
    }
}
