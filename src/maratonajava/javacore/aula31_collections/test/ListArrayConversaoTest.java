package maratonajava.javacore.aula31_collections.test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("------------------");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[0] = 2;
        numbersArray[0] = 3;
        List<Integer> arrayToList = Arrays.asList(numbersArray);
        System.out.println(arrayToList);
        arrayToList.set(0,12);
        System.out.println(arrayToList);

        System.out.println("------------------");

        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray));
        numbersList.add(15);
        System.out.println(numbersList);


        System.out.println("------------------");

        List<String> strings = Arrays.asList("1", "2");
        List<String> strings1 = List.of("1", "2");
    }
}
