package maratonajava.exercicios;

// 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("Antecessor de " + num + ": " + (num - 1) + "\n"
                + "Sucessor de " + num + ": " + (num + 1));
    }
}
