package maratonajava.javacore.aula11_construtores.test;

import maratonajava.javacore.aula11_construtores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        anime.print();
    }
}
