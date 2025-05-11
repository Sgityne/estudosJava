package maratonajava.exercicios;

/*  Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
    As informações fornecidas serão:
        valor da hora aula;
        número de aulas lecionadas no mês;
        percentual de desconto do INSS.

    Imprima na tela o salário líquido final.
*/

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor da Hora de aula: ");
        double valHr = scanner.nextDouble();
        System.out.print("Número de aulas lecionadas no mês: ");
        int numAulas = scanner.nextInt();
        System.out.print("Desconto INSS: ");
        double descontoINSS = scanner.nextDouble();

        double salarioBruto = valHr * numAulas;
        double salarioLiquido = salarioBruto - salarioBruto * descontoINSS/100;

        System.out.println("Sálario Líquido: " + salarioLiquido);
    }
}
