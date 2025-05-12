package maratonajava.javacore.aula22_exception.exception.test;

import maratonajava.javacore.aula22_exception.exception.domain.Employee;
import maratonajava.javacore.aula22_exception.exception.domain.InvalidLoginException;
import maratonajava.javacore.aula22_exception.exception.domain.Person;

public class OverrideWithExceptionTest {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }
}
