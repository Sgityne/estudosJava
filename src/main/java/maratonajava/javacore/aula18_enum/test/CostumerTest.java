package maratonajava.javacore.aula18_enum.test;

import maratonajava.javacore.aula18_enum.domain.Costumer;
import maratonajava.javacore.aula18_enum.domain.CostumerType;
import maratonajava.javacore.aula18_enum.domain.PaymentType;

public class CostumerTest {
    public static void main(String[] args) {
        Costumer costumer = new Costumer("Tsubasa", CostumerType.PESSOA_FISICA, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Akira", CostumerType.PESSOA_JURIDICA, PaymentType.CREDIT);

        System.out.println(costumer);
        System.out.println(costumer2);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        CostumerType costumerType = CostumerType.CostumerTypePerReportName("Pessoa Física");
        System.out.println(costumerType);
        System.out.println("test: " + CostumerType.CostumerTypePerReportName(costumer.getCostumerType().getReportName()));
    }
}
