package maratonajava.javacore.aula15_heranca.test;

import maratonajava.javacore.aula15_heranca.domain.Address;
import maratonajava.javacore.aula15_heranca.domain.Employee;
import maratonajava.javacore.aula15_heranca.domain.Person;

public class HerancaTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua 3");
        address.setCep("012345-209");

        Person person = new Person("Toyohisa Shimazu");
        person.setCpf("111111111-11");
        person.setAddress(address);

        Employee employee = new Employee("Oda Nobunaga");
        employee.setCpf("222222222-22");
        employee.setAddress(address);
        employee.setSalary(20000);
        System.out.println("--------------------");
        employee.print();
    }
}
