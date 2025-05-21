package maratonajava.javacore.aula27_regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
    public static void main(String[] args) {
        /*
        - \d = Todos os dígitos
        - \D = Tudo o que não for dígito (letras e caracteres especiais)
        - \s = Espaços em branco `\t` `\n` `\f` `\r`
        - \S = Todos os caracteres excluindo os brancos
        - \w = a-z, A-Z, dígitos, _
        - \W = Tudo o que não for incluso no `\w`
        - [] = Range, tudo entre a ao z minúsculo, tudo entre A e C maiúsculo
        *//*
        - ? = Zero ou uma
        - * = zero ou mais
        - + = uma ou mais
        - {n,m}` = de n até m
        - () = agrupamento
        - | = pipe, para OR: o(v|c)o → ovo, oco
        - $ = fim da linha
        - . = caractere coringa → 123, 133, 1@3, 1A3
        */
        String regex = "([\\w\\.])+@([a-z])+(\\.([a-z])+)+";
        String text = "luffy@hotmail.com, 123joraro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email Válido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(text.split(", ")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto:  " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
