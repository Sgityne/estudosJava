package maratonajava.javacore.aula21_polimorfismo.test;

import maratonajava.javacore.aula21_polimorfismo.domain.Computer;
import maratonajava.javacore.aula21_polimorfismo.domain.Television;
import maratonajava.javacore.aula21_polimorfismo.domain.Tomato;
import maratonajava.javacore.aula21_polimorfismo.service.TaxCalculator;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("Nuc10i7", 11000);
        Tomato tomato = new Tomato("Tomate Siciliano", 10);
        Television tv = new Television("Samsung 50\"", 5000);
        TaxCalculator.calculateTax(computer);
        System.out.println("------------------------------");
        TaxCalculator.calculateTax(tomato);
        System.out.println("------------------------------");
        TaxCalculator.calculateTax(tv);
    }
}
