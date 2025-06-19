package maratonajava.javacore.aula21_polimorfismo.service;

import maratonajava.javacore.aula21_polimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória");
    }
}
