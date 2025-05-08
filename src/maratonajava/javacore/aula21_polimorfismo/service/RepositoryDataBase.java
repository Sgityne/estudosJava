package maratonajava.javacore.aula21_polimorfismo.service;

import maratonajava.javacore.aula21_polimorfismo.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando no banco de dados");
    }
}
