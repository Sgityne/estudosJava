package maratonajava.javacore.aula32_generics.test;

import maratonajava.javacore.aula31_collections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Midoriya");
        list.add("Midoriya");

        for (String o : list) {
            System.out.println(o);
        }
        add(list, new Consumer("Midoriya"));
        for (Object o : list) {
            System.out.println(o);
        }
    }
    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
