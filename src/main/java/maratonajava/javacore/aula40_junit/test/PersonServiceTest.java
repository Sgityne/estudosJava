package maratonajava.javacore.aula40_junit.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.aula40_junit.domain.Person;
import maratonajava.javacore.aula40_junit.service.PersonService;

@Log4j2
public class PersonServiceTest {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult '{}'", personService.isAdult(person));
    }
}
