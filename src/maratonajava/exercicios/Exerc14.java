package maratonajava.exercicios;

// Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A
// e imprima na tela os valores.

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor A: ");
        int a = scanner.nextInt();
        System.out.print("Valor B: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valor A: " + a + "\nValor B: " + b);
    }
}
