package maratonajava.javacore.aula14_associacao.test;

import java.util.Scanner;

public class KeyboardInputTest {
    public static void main(String[] args) {
        // Leitura de dados pelo console
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String name = input.nextLine();
        System.out.println("Digite sua idade");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char gender = input.next().charAt(0);

        System.out.println("--------------------" +
                "\nNome: " + name +
                "\nIdade: " + age +
                "\nSexo: " + gender);
    }
}
