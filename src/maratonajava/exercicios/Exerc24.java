package maratonajava.exercicios;

/*  24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
    sabendo que o carro faz 12km com um litro.
    Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
    distância percorrida e a quantidade de litros utilizados para fazer a viagem.

    Fórmula: distância = tempo x velocidade.
    litros usados = distância / 12.
*/

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tempo de viagem (em horas): ");
        double hr = scanner.nextDouble();
        System.out.print("Velocidade média (km/h): ");
        double velmédia = scanner.nextDouble();

        double distance = hr * velmédia;

        System.out.println("Distância percorrida: " + distance + "km" +
                "\nLitros usados: " + (distance / 12) + "L");
    }
}
