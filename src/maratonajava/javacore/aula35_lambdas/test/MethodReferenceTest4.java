package maratonajava.javacore.aula35_lambdas.test;

import maratonajava.javacore.aula35_lambdas.domain.Anime;
import maratonajava.javacore.aula35_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest4 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimecomparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One Pice", 900)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);

        System.out.println(animeList);

        //BiFunction<String, Integer, Anime> animeBiFunction = (s,i) -> new Anime(s,i);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super campeões", 36));
    }
}
