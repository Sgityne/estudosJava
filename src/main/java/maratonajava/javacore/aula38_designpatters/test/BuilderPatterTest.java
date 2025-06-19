package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.Person;

public class BuilderPatterTest {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("DevDojo")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(person);
    }
}
