package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Manga;
import maratonajava.javacore.aula31_collections.domain.Smartphone;

import java.util.*;

class SmartphoneBrandComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));
        mangas.add(new Manga(10L, "Aaragon", 2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(1L, "Yuyu Kakusho", 8, 5);
        // lower < imediatamente menor
        // floor <= retorna o mesmo elemento, ou caso não exista, o imediato abaixo dele
        // higher > imediatamente maior
        // ceiling >= valor igual a ele ou maior
        // pollFirst: retorna e remove o primeiro elemento da lista
        // pollLast: retorna e remove o último elemento da lista
        System.out.println("--------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
