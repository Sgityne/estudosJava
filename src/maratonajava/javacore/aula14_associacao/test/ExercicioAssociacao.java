package maratonajava.javacore.aula14_associacao.test;

import maratonajava.javacore.aula14_associacao.domainexercicio.Local;
import maratonajava.javacore.aula14_associacao.domainexercicio.Professor;
import maratonajava.javacore.aula14_associacao.domainexercicio.Seminar;
import maratonajava.javacore.aula14_associacao.domainexercicio.Student;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Student student = new Student("Felipe", 17);
        Student[] studentsForSeminar = {student};

        Local local = new Local("Faculdade 1");
        Professor professor = new Professor("Leonor", "Matemática");

        Seminar seminar = new Seminar("Seminário Matemática", professor, local);
        Seminar[] seminarToMinister = {seminar};

        seminar.setStudents(studentsForSeminar);
        student.setSeminar(seminar);

        professor.setSeminars(seminarToMinister);
        student.print();
        professor.print();
        seminar.print();
    }
}
