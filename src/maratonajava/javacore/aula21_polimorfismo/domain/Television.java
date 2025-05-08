package maratonajava.javacore.aula21_polimorfismo.domain;

public class Television extends Product{
    public static final double PERCENT_TAX = 0.21;
    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando imposto da Televisão");
        return this.value * PERCENT_TAX;
    }
}
