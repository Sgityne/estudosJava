package maratonajava.javacore.aula8_classes.test;

import maratonajava.javacore.aula8_classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.println("Nome: " + professor.name + "\nIdade: " + professor.age + "\nSexo:  " + professor.gender);
    }
}
