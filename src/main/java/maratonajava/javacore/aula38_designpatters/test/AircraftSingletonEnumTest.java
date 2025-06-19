package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
    }
}
