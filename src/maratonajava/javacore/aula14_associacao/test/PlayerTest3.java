package maratonajava.javacore.aula14_associacao.test;

import maratonajava.javacore.aula14_associacao.domain.Player;
import maratonajava.javacore.aula14_associacao.domain.Team;

public class PlayerTest3 {
    // Associação 1:N ou N:1 / 1 <-> N ou N <-> 1
    public static void main(String[] args) {
        Player player = new Player("Cafu");
        Player player2 = new Player("Pelé");
        Team team = new Team("Brasil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("--- Jogador ---");
        player.print();
        System.out.println("--- Time ---");
        team.print();

    }
}
