package maratonajava.javacore.aula22_exception.error.test;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursivity();
    }

    public static void recursivity() {
        recursivity();
    }
}
