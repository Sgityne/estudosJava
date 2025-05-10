package maratonajava.exercicios;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso
// e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println(name);
        if (age < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
    }
}
