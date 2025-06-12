package maratonajava.javacore.aula32_generics.test;

import maratonajava.javacore.aula32_generics.domain.Car;
import maratonajava.javacore.aula32_generics.service.CarRentalService;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.retrieveAvailabreCar();
        System.out.println("Usando o carro por um mês...");
        carRentalService.returnRentalCar(car);
    }
}
