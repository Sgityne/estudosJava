package maratonajava.exercicios;

import java.util.Scanner;

/*  15 -Faça um algoritmo que leia o ano em que uma pessoa nasceu,
    imprima na tela quantos anos, meses
    e dias essa pessoa ja viveu.
    Leve em consideração o ano com 365 dias e o mês com 30 dias.

    (Ex: 5 anos, 2 meses e 15 dias de vida)
*/
public class Exerc15 {

    public static class CurrentData {
        private static int currentDay;
        private static int currentMonth;
        private static int currentYear;

        public static void setCurrentData(int currentDay, int currentMonth, int currentYear) {
            CurrentData.currentDay = currentDay;
            CurrentData.currentMonth = currentMonth;
            CurrentData.currentYear = currentYear;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrentData.setCurrentData(9,5,2025);
        System.out.print("Digite o dia de seu nascimento: ");
        int bornDay = scanner.nextInt();
        System.out.print("Digite o mês de seu nascimento: ");
        int bornMonth = scanner.nextInt();
        System.out.print("Digite o ano de seu nascimento: ");
        int bornYear = scanner.nextInt();

        int day = CurrentData.currentDay - bornDay;
        int month = CurrentData.currentMonth - bornMonth;
        int year = CurrentData.currentYear - bornYear;

        if (month < 0) {
            year -= 1;
            month += 12;
        }

        if (day < 0) {
            month -= 1;
            day += 30;
        }

        System.out.println(year + " anos, " + month + " meses e " + day + " dias de vida");
    }
}
