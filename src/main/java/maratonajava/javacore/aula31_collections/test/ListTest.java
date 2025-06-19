package maratonajava.javacore.aula31_collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("William");
        names.add("DevDojo Academy");
        names2.add("William");
        names2.add("DevDojo Academy");

        names.addAll(names2);
        for (Object name: names) {
            System.out.println(name);
        }

        System.out.println("--------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
