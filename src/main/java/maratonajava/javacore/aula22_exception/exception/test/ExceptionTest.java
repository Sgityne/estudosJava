package maratonajava.javacore.aula22_exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
