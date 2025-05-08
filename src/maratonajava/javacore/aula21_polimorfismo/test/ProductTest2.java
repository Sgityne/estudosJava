package maratonajava.javacore.aula21_polimorfismo.test;

import maratonajava.javacore.aula21_polimorfismo.domain.Computer;
import maratonajava.javacore.aula21_polimorfismo.domain.Product;
import maratonajava.javacore.aula21_polimorfismo.domain.Tomato;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.calculateTax());
        System.out.println("-------------------");
        Product product2 = new Tomato("Americano", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getValue());
        System.out.println(product2.calculateTax());

    }
}
