package maratonajava.javacore.aula13_modificadorestatico.test;

import maratonajava.javacore.aula13_modificadorestatico.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);
        Car.setLimitVelocity(180);
        c1.print();
        c2.print();
        c3.print();
    }
}
