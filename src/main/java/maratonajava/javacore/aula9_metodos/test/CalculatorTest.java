package maratonajava.javacore.aula9_metodos.test;

import maratonajava.javacore.aula9_metodos.domain.Calculator;

import java.util.Arrays;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));

        System.out.println("-------------");

        // Parãmetros e argumentos
        double result = calculator.divide(20, 2);
        System.out.println(result);

        System.out.println("-------------");

        // Retorno com void
        calculator.divideWithVoid(86, 0);

        System.out.println("-------------");

        // Parâmetros de tipo primitivo
        int num1 = 1;
        int num2 = 2;
        calculator.changeNumbers(num1, num2);
        System.out.println("Inside of CalculatorTest");
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);

        System.out.println("-------------");

        int[] numbers = {1, 2, 3, 4, 5};
        calculator.addArray(numbers);
        calculator.addVarArgs(numbers);
        calculator.addVarArgs(1, 2, 3, 4, 5);

        System.out.println("-------------");

        System.out.println(calculator.primeNumber(29)); // prime
        System.out.println(calculator.primeNumber(33)); // not prime
        System.out.println(Arrays.toString(calculator.return2x(1, 2, 3, 4, 5)));
    }
}
