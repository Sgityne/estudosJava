package maratonajava.javacore.aula8_classes.test;

import maratonajava.javacore.aula8_classes.domain.Studant;

public class StudantTest {
    public static void main(String[] args) {
        Studant studant = new Studant();
        Studant studant2 = new Studant();

        studant.name = "Luffy";
        studant.age = 21;
        studant.gender = 'M';

        System.out.println(studant); // Retorna o espaço de memória
        System.out.println(studant.name);
        System.out.println(studant.age);
        System.out.println(studant.gender);

        System.out.println("------------");

        System.out.println(studant2.name);
        System.out.println(studant2.age);
        System.out.println(studant2.gender);
    }
}
