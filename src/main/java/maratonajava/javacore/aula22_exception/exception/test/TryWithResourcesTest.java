package maratonajava.javacore.aula22_exception.exception.test;

import maratonajava.javacore.aula22_exception.exception.domain.Reader1;
import maratonajava.javacore.aula22_exception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {

        }
    }

    // Code without try with resources
    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
