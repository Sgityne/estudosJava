package maratonajava.javacore.aula11_construtores.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;
    private String studio;

    public Anime(String name, String type, int episodes, String genre) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", episodes=" + episodes +
                ", genre='" + genre + '\'' +
                ", studio='" + studio + '\'' +
                '}';
    }

    public Anime(String name, String type, int episodes, String genre, String studio) {
        this(name, type, episodes, genre);
        this.studio = studio;
    }

    public Anime() {

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String tipo) {
        this.type = tipo;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
