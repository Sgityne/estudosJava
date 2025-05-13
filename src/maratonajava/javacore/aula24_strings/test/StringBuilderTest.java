package maratonajava.javacore.aula24_strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Giovani Saraiva";
        name.concat(" Kaiser");
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Giovani Saraiva");
        sb.append(" Kaiser");
        System.out.println(sb);
        sb.reverse();
        sb.delete(0, 7);
        sb.reverse();
        System.out.println(sb);
    }
}
