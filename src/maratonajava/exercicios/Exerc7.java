package maratonajava.exercicios;

// 7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor (true ou false): ");
        boolean value = scanner.nextBoolean();

        if (value) {
            System.out.println("Is True");
        } else {
            System.out.println("Is value");
        }
    }
}
