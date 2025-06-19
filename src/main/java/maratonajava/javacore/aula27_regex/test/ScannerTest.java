package maratonajava.javacore.aula27_regex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa";
        String[] names = text.split(", ");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
