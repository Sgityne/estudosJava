package maratonajava.javacore.aula9_metodos.domain;

public class Person {
    private String name;
    private int age;

    public void print() {
        System.out.println("Nome:" + this.name);
        System.out.println("Idade:" + this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
