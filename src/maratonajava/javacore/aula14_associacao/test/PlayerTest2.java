package maratonajava.javacore.aula14_associacao.test;

import maratonajava.javacore.aula14_associacao.domain.Player;
import maratonajava.javacore.aula14_associacao.domain.Team;

public class PlayerTest2 {
    public static void main(String[] args) {
        // Associação 1 -> N
        Player player1 = new Player("Pelé");
        Team team = new Team("Seleção Brasileira");

        player1.setTeam(team);
        player1.print();
    }
}
