package maratonajava.javacore.aula12_blocosdeinicializacao.test;

import maratonajava.javacore.aula12_blocosdeinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        Anime anime2 = new Anime();

        System.out.println(" ");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
        System.out.println(" ");
        for (int episode : anime2.getEpisodes()) {
            System.out.print(episode + " ");
        }


    }
}
