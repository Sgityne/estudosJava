package maratonajava.introducao.aula3;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos: + - / *
        int number1 = 10;
        int number2 = 20;
        int result = number2 / number1;
        System.out.println(number2 - number1);
        System.out.println(result);

        /*
        The + operador when used with a string will convert the non-String operands to string
        and concatenate the string together
        */
        System.out.println("Valor: " + number2 + number1);

        // Para funcionar é necessário estar entre parênteses, ou colocando antes da String
        System.out.println("Valor: " + (number2 + number1));
        System.out.println(number2 * number1 + " Valor: " + (number2 + number1));

        // %
        int remainder = 20 % 2;
        System.out.println(remainder);

        // Operadores Relacionais: < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenNotEqualToTen = 10 != 10;
        System.out.println("isTenGreaterThanTwenty: " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty: " + isTenLessThanTwenty);
        System.out.println("isTenEqualToTwenty: " + isTenEqualToTwenty);
        System.out.println("isTenEqualToTen: " + isTenEqualToTen);
        System.out.println("isTenNotEqualToTen: " + isTenNotEqualToTen);

        // Operadores lógicos: && (AND) || (OR) ! (Not)
        int age = 29;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;
        System.out.println("isWithinTheLawGreaterThanThirty: " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty: " + isWithinTheLawLessThanThirty);

        double valueTotalCheckingAccount = 200;
        double valueTotalSavingsAccount = 10000;
        float valuePs5 = 5000F;
        boolean isPs5Buyable = valueTotalCheckingAccount > valuePs5 || valueTotalSavingsAccount > valuePs5;
        System.out.println("isPs5Buyable: " + isPs5Buyable);

        //Operadores de atribuição: = =+ -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000;  // 2800
        bonus -= 1000;  // 1800
        bonus *= 2;  // 3600
        bonus /= 2; // 1800
        System.out.println(bonus);

        //
        int counter = 0;
        counter++;
        counter--;
        System.out.println(counter); // 0
        System.out.println(counter++); // 0 -> Printa -> Incrementa
        System.out.println(++counter); // 2 -> Incrementa -> Printa
    }
}
