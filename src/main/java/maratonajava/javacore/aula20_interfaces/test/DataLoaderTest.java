package maratonajava.javacore.aula20_interfaces.test;

import maratonajava.javacore.aula20_interfaces.domain.DataLoader;
import maratonajava.javacore.aula20_interfaces.domain.DatabaseLoader;
import maratonajava.javacore.aula20_interfaces.domain.FileLoador;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoador fileLoador = new FileLoador();
        databaseLoader.load();
        fileLoador.load();

        databaseLoader.remove();
        fileLoador.remove();

        databaseLoader.checkPermission();
        fileLoador.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

    }
}
