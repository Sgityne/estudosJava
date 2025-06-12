package maratonajava.javacore.aula33_classesinternas.test;

public class OuterClassesTest3 {
    private String name = "William";
    static class Nested {
        private String lastName = "Suane";
        void print() {
            System.out.println(new OuterClassesTest3().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
