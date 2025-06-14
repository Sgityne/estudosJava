package maratonajava.javacore.aula31_collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(0);
        numbers.add(4);
        numbers.add(3);
        // (-(ponto de inserção) -1)
        // index 0,1,2,3
        // value 0,2,3,4
        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 1));
        System.out.println(Collections.binarySearch(numbers, 0));
        System.out.println(Collections.binarySearch(numbers, -1));
    }
}
