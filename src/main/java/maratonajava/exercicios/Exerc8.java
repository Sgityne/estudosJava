package maratonajava.exercicios;

// 8 - Faça um algoritmo que leia três valores inteiros diferentes
// e imprima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Exerc8 {

    private static boolean equalValues(int... nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[0] == nums[i]) {
                System.out.print("Valores iguais.\nPor favor digite outro número: ");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo valor: ");
        int num2 = scanner.nextInt();

        while (equalValues(num2, num1)) {
            num2 = scanner.nextInt();
        }

        System.out.print("Terceiro valor: ");
        int num3 = scanner.nextInt();

        while (equalValues(num3, num2, num1)) {
            num3 = scanner.nextInt();
        }

        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
