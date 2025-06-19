package maratonajava.javacore.aula21_polimorfismo.domain;

public class Computer extends Product{
    public static final double PERCENT_TAX = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto do Computador");
        return this.value * PERCENT_TAX;
    }


}
