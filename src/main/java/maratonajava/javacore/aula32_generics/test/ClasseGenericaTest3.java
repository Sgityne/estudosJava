package maratonajava.javacore.aula32_generics.test;

import maratonajava.javacore.aula32_generics.domain.Boat;
import maratonajava.javacore.aula32_generics.domain.Car;
import maratonajava.javacore.aula32_generics.service.BoatRentalService;
import maratonajava.javacore.aula32_generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest3 {
    public static void main(String[] args) {
        List<Car> carsAvailable = new ArrayList<>(
                List.of(
                        new Car("BMW"),
                        new Car("Mercedes")));
        List<Boat> boatAvailable = new ArrayList<>(
                List.of(
                        new Boat("Lancha"),
                        new Boat("Canoa")));
        RentalService<Car> carRentalService = new RentalService<>(carsAvailable);
        Car car = carRentalService.retrieveAvailabreVehicle();
        System.out.println("Usando o carro por um mês...");
        carRentalService.returnRentalVehicle(car);

        System.out.println("----------------------");

        RentalService<Boat> boatRentalService = new RentalService<>(boatAvailable);
        Boat boat = boatRentalService.retrieveAvailabreVehicle();
        System.out.println("Usando o barco por um mês...");
        boatRentalService.returnRentalVehicle(boat);

    }
}
