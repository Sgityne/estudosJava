package maratonajava.javacore.aula14_associacao.domainexercicio;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminario) {
        this.name = name;
        this.age = age;
        this.seminar = seminario;
    }

    public void print() {
        System.out.println("---------------------------" +
                "\nNome: " + this.name +
                "\nIdade: " + this.age);
        if (seminar == null) return;
        System.out.println("Seminário: " + seminar.getTitle());
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
