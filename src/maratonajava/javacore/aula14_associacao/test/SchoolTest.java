package maratonajava.javacore.aula14_associacao.test;

import maratonajava.javacore.aula14_associacao.domain.Professor;
import maratonajava.javacore.aula14_associacao.domain.School;

public class SchoolTest {
    public static void main(String[] args) {
        // Associação N -> 1
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor, professor2};
        School school = new School("Konoha", professors);

        school.print();

    }
}
