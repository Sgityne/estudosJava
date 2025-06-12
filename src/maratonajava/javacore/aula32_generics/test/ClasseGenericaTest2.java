package maratonajava.javacore.aula32_generics.test;

import maratonajava.javacore.aula32_generics.domain.Boat;
import maratonajava.javacore.aula32_generics.service.BoatRentalService;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.retrieveAvailabreBoat();
        System.out.println("Usando o barco por um mês...");
        boatRentalService.returnRentalBoat(boat);
    }
}
