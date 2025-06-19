package maratonajava.javacore.aula31_collections.test;

import maratonajava.javacore.aula31_collections.domain.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("William Suane");
        Consumer consumer2 = new Consumer("DevDojo Academy");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // lower < imediatamente menor
        // floor <= retorna o mesmo elemento, ou caso não exista, o imediato abaixo dele
        // higher > imediatamente maior
        // ceiling >= valor igual a ele ou maior
        // pollFirst: retorna e remove o primeiro elemento da lista
        // pollLast: retorna e remove o último elemento da lista
        System.out.println(map.headMap("C", true));
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.floorKey("C"));
    }
}
