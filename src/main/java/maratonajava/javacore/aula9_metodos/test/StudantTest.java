package maratonajava.javacore.aula9_metodos.test;

import maratonajava.javacore.aula9_metodos.domain.PrinterStudant;
import maratonajava.javacore.aula9_metodos.domain.Studant;

public class StudantTest {
    public static void main(String[] args) {
        Studant studant1 = new Studant();
        Studant studant2 = new Studant();
        PrinterStudant printer = new PrinterStudant();

        studant1.name = "Midoriya";
        studant1.age = 15;
        studant1.gender = 'M';

        studant2.name = "Sakura";
        studant2.age = 16;
        studant2.gender = 'F';

        // Parãmetros tipo referência
        printer.print(studant1);
        System.out.println(" ");
        printer.print(studant2);

        System.out.println("-------------------");

        // Referência this
        studant1.print();
        System.out.println(" ");
        studant2.print();


    }


}
