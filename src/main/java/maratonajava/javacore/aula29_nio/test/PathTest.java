package maratonajava.javacore.aula29_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Giovani\\Downloads\\Arquivos\\TI\\Java\\maratonaJava\\file.txt");
        Path p2 = Paths.get("C:\\Users\\Giovani\\Downloads\\Arquivos\\TI\\Java\\maratonaJava","file.txt");
        Path p3 = Paths.get("C:","Users\\Giovani\\Downloads\\Arquivos\\TI\\Java\\maratonaJava","file.txt");
        Path p4 = Paths.get("C:","Users", "Giovani", "Downloads", "Arquivos", "TI", "Java", "maratonaJava", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
