package maratonajava.javacore.aula28_io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O DevDojo é o melhor curso do Brasil.");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
