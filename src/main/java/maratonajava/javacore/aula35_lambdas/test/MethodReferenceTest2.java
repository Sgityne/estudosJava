package maratonajava.javacore.aula35_lambdas.test;

import maratonajava.javacore.aula35_lambdas.domain.Anime;
import maratonajava.javacore.aula35_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest2 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Pice", 900),
                new Anime("Naruto", 500)));
        //animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
