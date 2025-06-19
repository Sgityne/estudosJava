package maratonajava.exercicios;

import java.util.Scanner;

// 2 - Faça um algoritmo para receber um número qualquer
// e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par.");
        } else {
            System.out.println("O número " + num + " é ímpar.");
        }

        if (num > 0) {
            System.out.println("O número " + num + " é positivo.");
        } else {
            System.out.println("O número " + num + " é negativo.");
        }
    }
}
