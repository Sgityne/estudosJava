package maratonajava.javacore.aula22_exception.exception.domain;

public class Employee extends Person {
    public void save() throws InvalidLoginException {
        System.out.println("Salvando funcionário");
    }
}
