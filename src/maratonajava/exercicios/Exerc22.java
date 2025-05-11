package maratonajava.exercicios;

// 22 - Faça um algoritmo que leia dois valores inteiros A e B,
// imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor A: ");
        int valA = scanner.nextInt();
        System.out.print("Valor B: ");
        int valB = scanner.nextInt();

        System.out.println("Quociente de " + valA + "/" + valB + ": " + (valA / valB) +
                "\nResto: " + (valA % valB));
    }
}
