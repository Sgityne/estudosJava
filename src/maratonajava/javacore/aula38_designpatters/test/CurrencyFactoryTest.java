package maratonajava.javacore.aula38_designpatters.test;

import maratonajava.javacore.aula38_designpatters.domain.Country;
import maratonajava.javacore.aula38_designpatters.domain.Currency;
import maratonajava.javacore.aula38_designpatters.domain.CurrencyFactory;

public class CurrencyFactoryTest {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }

}
