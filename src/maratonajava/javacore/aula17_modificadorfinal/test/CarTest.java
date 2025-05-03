package maratonajava.javacore.aula17_modificadorfinal.test;

import maratonajava.javacore.aula17_modificadorfinal.domain.Car;
import maratonajava.javacore.aula17_modificadorfinal.domain.Ferrari;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.LIMIT_SPEED);

        System.out.println(car.BUYER);
        car.BUYER.setName("Kuririn");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
