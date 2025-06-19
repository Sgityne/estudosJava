package maratonajava.javacore.aula32_generics.service;

import maratonajava.javacore.aula32_generics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private List<Boat> boatAvailable = new ArrayList<>(
            List.of(
                    new Boat("Lancha"),
                    new Boat("Canoa")));

    public Boat retrieveAvailabreBoat() {
        System.out.println("Buscando barco disponível...");Boat boat = boatAvailable.remove(0);
        System.out.println("Alugando barco:" + boat);
        System.out.println("Barcos disponíveis para alugar");
        System.out.println(boatAvailable);
        return boat;
    }

    public void returnRentalBoat(Boat boat) {
        System.out.println("Devolvendo barco: " + boat);
        boatAvailable.add(boat);
        System.out.println("Barcos disponíveis para alugar: " );
        System.out.println(boatAvailable);
    }

}
