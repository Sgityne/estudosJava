package maratonajava.exercicios;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
// calcule a média das nota obtidas,
// imprima na tela o nome do aluno
// e se o aluno foi aprovado ou reprovado.
// Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("1º Nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("2º Nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("3º Nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("4º Nota: ");
        double nota4 = scanner.nextDouble();

        double median = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(name);

        if (median >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
