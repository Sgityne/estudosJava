package maratonajava.javacore.aula9_metodos.domain;

public class PrinterEmployer {
    public void print(Employer employer) {
        System.out.println("Name: " + employer.getName());
        System.out.println("Idade: " + employer.getAge());
        if (employer.getSalary() == null) {
            return;
        }
        for (int i = 0; i < employer.getSalary().length; i++) {
            System.out.println(i + 1 + "º Salário: " + employer.getSalary()[i]);
        }
    }

    public void averageSalary(Employer employer) {
        if (employer.getSalary() == null) {
            return;
        }
        double sum = 0;
        for (double num : employer.getSalary()) {
            sum += num;
        }
        System.out.println("Média dos Salários: " + sum / employer.getSalary().length);
    }
}
