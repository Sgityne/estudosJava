package maratonajava.exercicios;

// 1 - Faça um algoritmo que leia os valores de A, B, C
// e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor A: ");
        int a = scanner.nextInt();
        System.out.println("Valor B: ");
        int b = scanner.nextInt();
        System.out.println("Valor C: ");
        int c = scanner.nextInt();

        int somaAB = a + b;
        System.out.println("Soma entre A e B: " + somaAB);
        if (somaAB < c) {
            System.out.println("A soma entre A e B (" + somaAB + ") é menor que C (" + c + ").");
        } else {
            System.out.println("A soma entre A e B (" + somaAB + ") é maior que C (" + c + ").");

        }

    }
}
