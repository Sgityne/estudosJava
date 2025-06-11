package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        // Forma iterativa
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }

        // Lambda
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
