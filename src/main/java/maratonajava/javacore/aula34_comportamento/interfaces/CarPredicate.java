package maratonajava.javacore.aula34_comportamento.interfaces;

import maratonajava.javacore.aula34_comportamento.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
