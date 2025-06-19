package maratonajava.javacore.aula8_classes.test;

import maratonajava.javacore.aula8_classes.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        /*
        Referência de objeto
        car1 = car2;
        car1 se tornará car2, e car1 anterior será perdido.
        Só se pode fazer isso quando são objetos do mesmo tipo
         */

        car1.name = "Tesla";
        car1.model = "Model X";
        car1.year = 2025;

        car2.name = "BMW";
        car2.model = "8-Series";
        car2.year = 2025;

        System.out.println("Carro 1 \nNome: " + car1.name + "\nModelo: " + car1.model + "\nAno:  " + car1.year);
        System.out.println(" ");
        System.out.println("Carro 2 \nNome: " + car2.name + "\nModelo: " + car2.model + "\nAno:  " + car2.year);
    }
}
