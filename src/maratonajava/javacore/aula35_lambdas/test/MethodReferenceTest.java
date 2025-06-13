package maratonajava.javacore.aula35_lambdas.test;

import maratonajava.javacore.aula35_lambdas.domain.Anime;
import maratonajava.javacore.aula35_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Pice", 900),
                new Anime("Naruto", 500)));
        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
