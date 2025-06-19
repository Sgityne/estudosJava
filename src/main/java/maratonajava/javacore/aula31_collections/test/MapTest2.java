package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Consumer;
import maratonajava.javacore.aula31_collections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("William Suane");
        Consumer consumer2 = new Consumer("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        Map<Consumer, Manga> consumerManga = new HashMap<>();
        consumerManga.put(consumer1, manga1);
        consumerManga.put(consumer2, manga4);
        for (Map.Entry<Consumer, Manga> entry : consumerManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
