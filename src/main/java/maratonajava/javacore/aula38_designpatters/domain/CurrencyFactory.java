package maratonajava.javacore.aula38_designpatters.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
