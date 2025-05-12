package maratonajava.javacore.aula22_exception.exception.domain;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
