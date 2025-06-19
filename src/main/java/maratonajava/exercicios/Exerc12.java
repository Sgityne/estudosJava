package maratonajava.exercicios;

import java.util.Scanner;

/*
    12 - Faça um algoritmo que leia o valor de um produto
    e determine o valor que deve ser pago,
    conforme a escolha da forma de pagamento pelo comprador
    e imprima na tela o valor final do produto a ser pago.
    Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

    Tabela de Código de Condições de Pagamento

    1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    2 - À Vista no cartão de crédito, recebe 10% de desconto
    3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
*/

public class Exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double value = scanner.nextDouble();
        System.out.println("Escolha a forma de pagamento\n" +
                "1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                "2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        boolean validOption = true;

        while (validOption) {
        int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Valor original: R$" + (value) +
                            "\nValor do desconto: R$" + (value * 0.15) +
                            "\nTotal: R$" + (value - value * 0.15));
                    return;
                case 2:
                    System.out.println("Valor original: R$" + (value) +
                            "\nValor do desconto: R$" + (value * 0.1) +
                            "\nTotal: R$" + (value - value * 0.1));
                    return;
                case 3:
                    System.out.println("Valor original: R$" + (value) +
                            "\nValor do desconto: R$" + 0 +
                            "\nTotal: R$" + (value / 2) + "Em 2x parcelas");
                    return;
                case 4:
                    System.out.println("Valor original: R$" + (value) +
                            "\nValor do desconto: R$" + (value * 0.1) +
                            "\nTotal: R$" + (value + value * 0.1) + "Em 3x parcelas");
                    return;
                default:
                    System.out.println("Opção inválida\nEscolha a forma de pagamento\n" +
                            "1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
                            "2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
                            "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
                            "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
            }
        }
    }
}
