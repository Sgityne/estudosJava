package maratonajava.exercicios;

import java.util.Scanner;

// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
// e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.

public class Exerc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1º Valor: ");
        double val1 = scanner.nextDouble();
        System.out.print("2º Valor: ");
        double val2 = scanner.nextDouble();
        System.out.print("3º Valor: ");
        double val3 = scanner.nextDouble();

        if (val1 == val2 && val1 == val3) {
            System.out.println("Triângulo equilátero");
        } else if (val1 == val2 || val1 == val3 || val2 == val3) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
