package maratonajava.javacore.aula32_generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest2 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsultation(dogs);
        printConsultation(cats);
        List<Animal> animals = new ArrayList<>();
        printCosultationAnimal(animals);
    }
    //Type erasure
    private static void printConsultation(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consultation();
        }
    }
    private static void printCosultationAnimal(List<? super Animal> animals) {
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
