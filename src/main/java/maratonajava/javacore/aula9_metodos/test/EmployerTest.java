package maratonajava.javacore.aula9_metodos.test;

import maratonajava.javacore.aula9_metodos.domain.Employer;
import maratonajava.javacore.aula9_metodos.domain.PrinterEmployer;

public class EmployerTest {
    public static void main(String[] args) {
        Employer employer = new Employer();
        PrinterEmployer printer = new PrinterEmployer();
        employer.setName("Sanji");
        employer.setAge(23);
        employer.setSalary(new double[]{1200, 987.32, 2000});

        printer.print(employer);
        printer.averageSalary(employer);
    }
}
