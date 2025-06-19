package maratonajava.javacore.aula9_metodos.domain;

public class Calculator {

    public int add(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtract(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public double divide(double num1, double num2) {
        if (num2 == 2) {
            return 0;
        }
        return (num1 / num2);
    }

    // Retorno com void
    public void divideWithVoid(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    // Parâmetros do tipo primitivo
    public void changeNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("inside of changeNumbers");
        System.out.println("Num1: " + num1 + "\nNum2: " + num2);
    }

    public void addArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    // VarArgs
    public void addVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    // Validar primo result true se for false se n for
    public boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // recebe uma lista, return toda lista x2
    public int[] return2x(int... numbers) {
        int[] x2 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            x2[i] = numbers[i] * 2;
        }
        return x2;
    }
}
