package maratonajava.javacore.aula37_streams.test;

import maratonajava.javacore.aula37_streams.domain.Category;
import maratonajava.javacore.aula37_streams.domain.LightNovel;
import maratonajava.javacore.aula37_streams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    );

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        //Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE, Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
                                Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect1);

    }
}
