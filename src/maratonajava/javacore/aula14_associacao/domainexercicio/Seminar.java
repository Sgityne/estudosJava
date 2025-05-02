package maratonajava.javacore.aula14_associacao.domainexercicio;

import java.util.Arrays;

public class Seminar {
    private String title;
    private Student[] students;
    private Professor professor;
    private Local local;

    public Seminar(String title, Professor professor, Local local) {
        this.title = title;
        this.professor = professor;
        this.local = local;
    }

    public Seminar(String title, Student[] students, Professor professor, Local local) {
        this.title = title;
        this.students = students;
        this.professor = professor;
        this.local = local;
    }

    public void print() {
        System.out.println("---------------------------" +
                "\nTítulo: " + this.title);
        if (students != null) {
            System.out.println("## Alunos no Seminário ##");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
        System.out.println("Professor: " + professor.getName() +
                "\nLocal: " + local.getAddress());
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
