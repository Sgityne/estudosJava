package maratonajava.javacore.aula39_jdbc.repository;

import maratonajava.javacore.aula39_jdbc.conn.ConnectionFactory;
import maratonajava.javacore.aula39_jdbc.domain.Producer;
import maratonajava.javacore.aula39_jdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE ?;";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()) {
                producers.add(Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer) {
//        String sql = "UPDATE producer SET name = ? WHERE id = ?";
//        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
//            jrs.setCommand(sql);
//            jrs.setString(1, producer.getName());
//            jrs.setInt(2, producer.getId());
//            jrs.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE id = ?";
        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
             Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            crs.acceptChanges();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
