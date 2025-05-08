package maratonajava.javacore.aula21_polimorfismo.test;

import maratonajava.javacore.aula21_polimorfismo.repository.Repository;
import maratonajava.javacore.aula21_polimorfismo.service.RepositoryDataBase;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();
    }
}
