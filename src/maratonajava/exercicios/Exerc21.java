package maratonajava.exercicios;

// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import java.util.Random;

public class Exerc21 {
    public static void main(String[] args) {
        System.out.println("Valor aleatório entre 0 e 100");
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
