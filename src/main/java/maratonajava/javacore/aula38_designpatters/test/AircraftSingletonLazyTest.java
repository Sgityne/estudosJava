package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
