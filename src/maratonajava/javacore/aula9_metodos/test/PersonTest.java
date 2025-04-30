package maratonajava.javacore.aula9_metodos.test;

import maratonajava.javacore.aula9_metodos.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jiraya");
        person.setAge(70);
        person.print();
        System.out.println(" ");
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
