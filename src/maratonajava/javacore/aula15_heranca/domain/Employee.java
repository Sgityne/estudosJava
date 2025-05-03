package maratonajava.javacore.aula15_heranca.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name) {
        super(name);
    }

    public void print() {
        super.print();
        System.out.println("Salário: " + this.salary);
    }

    public void paymentReport() {
        System.out.println("Eu " + this.name + "recebi o salário de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
