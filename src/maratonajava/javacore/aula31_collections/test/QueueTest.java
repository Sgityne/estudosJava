package maratonajava.javacore.aula31_collections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        for (String string : queue) {
            System.out.println(string);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
