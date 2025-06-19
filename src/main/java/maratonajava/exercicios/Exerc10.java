package maratonajava.exercicios;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno,
// e imprima na tela a média das notas.

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1º Nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("2º Nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("3º Nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Média das notas: " + ((nota1 + nota2 + nota3) / 3));
    }
}
