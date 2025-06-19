package maratonajava.javacore.aula10_sobrecargametodos.test;

import maratonajava.javacore.aula10_sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.print();
    }
}
