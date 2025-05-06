package maratonajava.javacore.aula20_interfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10; // public static final <- estão implícitos
    void load();    // public abstract <- está implícito

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
