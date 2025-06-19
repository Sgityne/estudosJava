package maratonajava.javacore.aula25_dataseformatacao.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        Locale localeBR = Locale.of("pt", "BR");
        Locale locateJP = Locale.JAPAN;
        Locale locateIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locateJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(locateIT);
        double value = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }
        String valueString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
