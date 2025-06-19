package maratonajava.javacore.aula21_polimorfismo.service;

import maratonajava.javacore.aula21_polimorfismo.domain.Product;
import maratonajava.javacore.aula21_polimorfismo.domain.Tomato;

public class TaxCalculator {
    public static void calculateTax(Product product) {
        System.out.println("Relatório de imposto");
        double tax = product.calculateTax();
        System.out.println("Imposto do " + product.getName());
        System.out.println("Valor: " + product.getValue());
        System.out.println("Imposto a ser pago " + tax);
        if(product instanceof Tomato){
            Tomato tomato = (Tomato) product;
            // String dateValidity = ((Tomato) product).getDatevalidity() <- Cast <- Outra maneira de fazer o instanceOf
            System.out.println("Data de Validade: " + tomato.getDateValidity());
        }
    }
}
