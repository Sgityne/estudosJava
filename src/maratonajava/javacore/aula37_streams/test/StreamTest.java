package maratonajava.javacore.aula37_streams.test;

import maratonajava.javacore.aula37_streams.domain.LightNovel;

import java.util.Comparator;
import java.util.List;

//1. order LightNovel by Title
//2. Retrieve the first 3 light novels with price less than 4
public class StreamTest {
    private static List<LightNovel> lightNovels = List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    );

    public static void main(String[] args) {
        /*
          list.stream().sorted(new Comparator<LightNovel>() {
              @Override
              public int compare(LightNovel o1, LightNovel o2) {
                  return o1.getTitle().compareTo(o2.getTitle());
              }
          }).toList();
        */
        //list.stream().sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle())).toList();
        List<LightNovel> orderedlist = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle)).toList();
        orderedlist.forEach(System.out::println);
        orderedlist.stream()
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .forEach(System.out::println);
    }
}
