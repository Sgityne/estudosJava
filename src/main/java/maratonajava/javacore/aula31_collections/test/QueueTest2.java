package maratonajava.javacore.aula31_collections.test;


import maratonajava.javacore.aula31_collections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest2 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L, "Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
