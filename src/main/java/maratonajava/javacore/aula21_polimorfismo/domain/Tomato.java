package maratonajava.javacore.aula21_polimorfismo.domain;

public class Tomato extends Product{
    public static final double PERCENT_TAX = 0.06;
    private String dateValidity;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculando impoasto do tomate");
        return this.value * PERCENT_TAX;
    }

    public String getDateValidity() {
        return dateValidity;
    }

    public void setDateValidity(String dateValidity) {
        this.dateValidity = dateValidity;
    }
}
