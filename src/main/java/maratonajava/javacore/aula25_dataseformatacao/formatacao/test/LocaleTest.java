package maratonajava.javacore.aula25_dataseformatacao.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // Padrão lingua-País
        // pt-BR
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calender = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println(localeItaly.getDisplayCountry() + ": " + df1.format(calender.getTime()));
        System.out.println(localeCH.getDisplayCountry() + ": " + df2.format(calender.getTime()));
        System.out.println(localeIndia.getDisplayCountry() + ": " + df3.format(calender.getTime()));
        System.out.println(localeJapao.getDisplayCountry() + ": " + df4.format(calender.getTime()));
        System.out.println(localeHolanda.getDisplayCountry() + ": " + df5.format(calender.getTime()));

        System.out.println("---------------------------");

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
        System.out.println(localeItaly.getDisplayLanguage(localeJapao));
    }
}
