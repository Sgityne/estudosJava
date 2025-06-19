package maratonajava.javacore.aula24_strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (end - start) + "ms");


    }

    private static void concatString(int lenght) {
        String text = "";
        for (int i = 0; i < lenght; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int lenght) {
        StringBuilder sb = new StringBuilder(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int lenght) {
        StringBuffer sb = new StringBuffer(lenght);
        for (int i = 0; i < lenght; i++) {
            sb.append(i);
        }
    }
}
