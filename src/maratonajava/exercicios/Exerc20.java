package maratonajava.exercicios;

// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja saber a tabuada: ");
        int val = scanner.nextInt();

        System.out.println("Tabuada de " + val);
        for (int i = 1; i < 10; i++) {
            System.out.println(val + " x " + i + " = " + (val * i));
        }
    }
}
