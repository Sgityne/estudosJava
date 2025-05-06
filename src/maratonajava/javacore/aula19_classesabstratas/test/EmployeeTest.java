package maratonajava.javacore.aula19_classesabstratas.test;

import maratonajava.javacore.aula19_classesabstratas.domain.Developer;
import maratonajava.javacore.aula19_classesabstratas.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Touya", 12000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
