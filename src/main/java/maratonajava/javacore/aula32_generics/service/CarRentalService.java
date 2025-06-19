package maratonajava.javacore.aula32_generics.service;

import maratonajava.javacore.aula32_generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> carsAvailable = new ArrayList<>(
            List.of(
                    new Car("BMW"),
                    new Car("Mercedes")));

    public Car retrieveAvailabreCar() {
        System.out.println("Buscando carro disponível...");
        Car car = carsAvailable.remove(0);
        System.out.println("Alugando carro:" + car);
        System.out.println("Carros disponíveis para alugar");
        System.out.println(carsAvailable);
        return car;
    }

    public void returnRentalCar(Car car) {
        System.out.println("Devolvendo carro: " + car);
        carsAvailable.add(car);
        System.out.println("Carros disponíveis para alugar: " );
        System.out.println(carsAvailable);
    }

}
