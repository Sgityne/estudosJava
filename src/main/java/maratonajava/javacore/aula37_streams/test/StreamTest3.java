package maratonajava.javacore.aula37_streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnew Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustamo Lima", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
