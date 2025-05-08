package maratonajava.javacore.aula21_polimorfismo.test;

import maratonajava.javacore.aula21_polimorfismo.domain.Computer;
import maratonajava.javacore.aula21_polimorfismo.domain.Product;
import maratonajava.javacore.aula21_polimorfismo.domain.Tomato;
import maratonajava.javacore.aula21_polimorfismo.service.TaxCalculator;

public class ProductTest3 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        Tomato tomato = new Tomato("Americano", 20);
        tomato.setDateValidity("11/12/21");

        TaxCalculator.calculateTax(tomato);
        System.out.println("-----------------------------");
        TaxCalculator.calculateTax(product);
    }

}
