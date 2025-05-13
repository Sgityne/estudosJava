package maratonajava.javacore.aula24_strings.test;

public class StringTest {
    public static void main(String[] args) {
        String name = "William"; // String constant pool
        String name2 = "William";
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        // Sendo criado direto no Heap, fora do String pool
        String name3 = new String("William"); // variável de referência, objeto do tipo String, uma String na String pool
        System.out.println(name == name3);
        System.out.println(name == name3.intern()); // Está sendo comparada com o valor dentro da String pool
    }
}
