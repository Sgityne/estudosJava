package maratonajava.exercicios;

// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double num = scanner.nextDouble();

        System.out.println("Valor com reajuste: " + (num + num * 0.05));
    }
}
