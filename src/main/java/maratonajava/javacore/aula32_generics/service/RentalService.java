package maratonajava.javacore.aula32_generics.service;

import maratonajava.javacore.aula32_generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> vehicleAvailable;

    public RentalService(List<T> vehicleAvailable) {
        this.vehicleAvailable = vehicleAvailable;
    }

    public T retrieveAvailabreVehicle() {
        System.out.println("Buscando veículo disponível...");
        T t = vehicleAvailable.remove(0);
        System.out.println("Alugando veículo:" + t);
        System.out.println("Veículos disponíveis para alugar");
        System.out.println(vehicleAvailable);
        return t;
    }

    public void returnRentalVehicle(T t) {
        System.out.println("Devolvendo veículo: " + t);
        vehicleAvailable.add(t);
        System.out.println("Veículos disponíveis para alugar: " );
        System.out.println(vehicleAvailable);
    }
}
