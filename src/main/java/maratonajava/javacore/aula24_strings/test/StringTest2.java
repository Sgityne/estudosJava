package maratonajava.javacore.aula24_strings.test;

public class StringTest2 {
    public static void main(String[] args) {
        String name = "Luffy";
        String name2 = "  Luffy  ";
        String nums = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("f", "l"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(nums.substring(0, 2));
        System.out.println(name2);
        System.out.println(name2.trim());
    }
}
