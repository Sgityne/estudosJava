package maratonajava.javacore.aula37_streams.test;

import maratonajava.javacore.aula37_streams.domain.LightNovel;

import java.util.List;

public class StreamTest5 {
    private static List<LightNovel> lightNovels = List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    );
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findFirst().ifPresent(System.out::println);
    }
}
