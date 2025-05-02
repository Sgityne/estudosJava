package maratonajava.javacore.aula14_associacao.test;

import maratonajava.javacore.aula14_associacao.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        // Array de Objetos
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafu");
        Player[] players = new Player[]{player1, player2, player3};

        for(Player player : players){
            player.print();
        }
    }
}
