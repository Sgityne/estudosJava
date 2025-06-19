package maratonajava.javacore.aula37_streams.test;

import java.util.Arrays;
import java.util.List;

public class StreamTest4 {
    public static void main(String[] args) {
    List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        List<String> letters = words.stream()
                .map(w -> w.split(""))//Stream<String[]>
                .flatMap(Arrays::stream)//Stream<String>
                .toList();
        System.out.println(letters);
    }
}
