package maratonajava.javacore.aula32_generics.test;

abstract class Animal {
    public abstract void consultation();
}

class Dog extends Animal {

    @Override
    public void consultation() {
        System.out.println("Consultando cachorro");
    }
}

class Cat extends Animal {
    @Override
    public void consultation() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsultation(dogs);
        printConsultation(cats);
    }

    private static void printConsultation(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consultation();
        }
    }
}
