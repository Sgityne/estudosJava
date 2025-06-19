package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Consumer;
import maratonajava.javacore.aula31_collections.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("William Suane");
        Consumer consumer2 = new Consumer("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        List<Manga> mangaConsumer1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumer2List = List.of(manga3, manga4);
        Map<Consumer, List<Manga>> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, mangaConsumer1List);
        consumerMangaMap.put(consumer2, mangaConsumer1List);
        for (Map.Entry<Consumer, List<Manga>> entry : consumerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("-------" + manga.getName());
            }
        }

    }
}
