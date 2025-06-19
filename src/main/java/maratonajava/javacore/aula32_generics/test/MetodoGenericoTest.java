package maratonajava.javacore.aula32_generics.test;

import maratonajava.javacore.aula32_generics.domain.Boat;

import java.util.List;

public class MetodoGenericoTest {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithObject(new Boat("Canoa"));
        System.out.println(boatList);
    }

    private static <T> List<T> createArrayWithObject(T t) {
        return List.of(t);
    }
}
