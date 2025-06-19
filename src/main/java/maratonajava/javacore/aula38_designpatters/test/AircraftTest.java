package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.Aircraft;

public class AircraftTest {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
