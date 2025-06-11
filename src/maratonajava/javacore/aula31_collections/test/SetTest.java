package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
