package maratonajava.exercicios;

// 5 - Faça um algoritmo que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha
// e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite seu salário: ");
        double salary = scanner.nextDouble();

        System.out.println("Você recebe" + String.format("% .2f", (salary / salarioMinimo)) + " salários mínimos.");
    }
}
