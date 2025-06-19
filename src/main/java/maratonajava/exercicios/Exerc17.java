package maratonajava.exercicios;

import java.util.Scanner;

/*
    17 - Faça um algoritmo que leia uma temperatura em Fahrenheit
    e calcule a temperatura correspondente em grau Celsius.
    Imprima na tela as duas temperaturas.

    Fórmula: C = (5 * ( F-32) / 9)
*/
public class Exerc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura em fahrenheit: ");
        double tempF = scanner.nextDouble();

        double tempC = (5 * (tempF - 32) / 9);

        System.out.println("Temperatura em fahrenheit: " + tempF + "\nTemperatura em celsius: " + tempC);
    }
}
