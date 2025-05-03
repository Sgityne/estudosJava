package maratonajava.javacore.aula16_sobrescrita.domain;

public class Anime {
    private String name;

    @Override
    public String toString(){
        return "Anime: " + this.name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
