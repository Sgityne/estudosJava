package maratonajava.javacore.aula40_junit.service;

import maratonajava.javacore.aula40_junit.domain.Person;

import java.util.List;
import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;

    }

    public List<Person> filterRemovingNotAdult(List<Person> personList) {
        return personList.stream().filter(this::isAdult).toList();
    }
}
