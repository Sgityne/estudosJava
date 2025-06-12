package maratonajava.javacore.aula33_classesinternas.test;

import maratonajava.javacore.aula32_generics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BoatNameComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest2 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));
        // boatList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        boatList.sort(new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(boatList);
    }
}
