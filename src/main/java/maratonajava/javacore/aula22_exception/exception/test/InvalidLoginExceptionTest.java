package maratonajava.javacore.aula22_exception.exception.test;

import maratonajava.javacore.aula22_exception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest {
    public static void main(String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.print("Usuário: ");
        String typedUsername = scanner.nextLine();
        System.out.print("Senha: ");
        String typedPassword = scanner.nextLine();
        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)) {
            throw new InvalidLoginException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
