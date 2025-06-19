package maratonajava.javacore.aula27_regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
        /*
        - `\d` = Todos os dígitos
        - `\D` = Tudo o que não for dígito (letras e caracteres especiais)
        - `\s` = Espaços em branco `\t` `\n` `\f` `\r`
        - `\S` = Todos os caracteres excluindo os brancos
        - `\w` = a-z, A-Z, dígitos, _
        - `\W` = Tudo o que não for incluso no `\w`
        - [] = Range, tudo entre a ao z minúsculo, tudo entre A e C maiúsculo
        */
        //String regex = "[a-zA-C]";

        String regex = "0[xX][0-9a-fA-F]";
        String text = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto:  " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        int hexNumber = 0x59F86A;
        System.out.println(hexNumber);
    }
}
