package maratonajava.javacore.aula25_dataseformatacao.datas.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_000L);
        System.out.println(date);
        Date dateAc = new Date();
        System.out.println(dateAc.getTime());
    }
}
