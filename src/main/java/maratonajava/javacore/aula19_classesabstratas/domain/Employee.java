package maratonajava.javacore.aula19_classesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    public abstract void calculateBonus();

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }
}
