package maratonajava.javacore.aula34_comportamento.test;

import maratonajava.javacore.aula34_comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("------------");
        System.out.println(filterByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carsList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsList.add(car);
            }
        }
        return carsList;
    }
    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> carsList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() <= year) {
                carsList.add(car);
            }
        }
        return carsList;
    }

}
