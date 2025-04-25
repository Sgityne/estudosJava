package maratonajava.introducao.aula4;

public class ExercicioSalario {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTaxRate = 9.70 / 100;
        double secondTaxRate = 37.35 / 100;
        double lastTaxRate = 49.50 / 100;
        double taxValue;

        if (annualSalary <= 34712) {
            taxValue = annualSalary * firstTaxRate;
        } else if (annualSalary > 34712 && annualSalary <= 68507) {
            taxValue = annualSalary * secondTaxRate;
        } else {
            taxValue = annualSalary * lastTaxRate;
        }

        double newSalary = annualSalary - taxValue;
        String taxIncome = String.format("%.2f", taxValue);
        System.out.println("Valor do Imposto: " + taxIncome + "| Novo Salário: " + newSalary);
    }
}
