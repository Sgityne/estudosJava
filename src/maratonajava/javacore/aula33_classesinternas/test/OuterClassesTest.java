package maratonajava.javacore.aula33_classesinternas.test;

public class OuterClassesTest {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest outer = new OuterClassesTest();
        Inner inner = outer.new Inner();
        Inner inner2 = new OuterClassesTest().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
