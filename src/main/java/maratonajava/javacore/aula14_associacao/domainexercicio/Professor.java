package maratonajava.javacore.aula14_associacao.domainexercicio;

import java.util.Arrays;

public class Professor {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminar[] seminario) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminario;
    }

    public void print() {
        System.out.println("---------------------------");
        System.out.println("Professor: " + this.name);
        if (this.seminars == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminar seminar : this.seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocal().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length==0) continue;
            System.out.println("** Alunos **");
            for (Student student : seminar.getStudents()) {
                System.out.println("Aluno: " + student.getName() + " idade: " + student.getAge());
            }
        }
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
