package maratonajava.javacore.aula33_classesinternas.test;

public class OuterClassesTest2 {
    private String name = "Midoriya";

    void print() {
        class LocalClass {
            final String lastName = "Izuku";
            public void printLocal() {
                System.out.println(name = " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest2 outer = new OuterClassesTest2();
        outer.print();
    }
}
