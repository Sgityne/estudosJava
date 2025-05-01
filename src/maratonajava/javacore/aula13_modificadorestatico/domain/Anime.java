package maratonajava.javacore.aula13_modificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default o o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name){
        this.name = name;
    }

    public Anime() {
        for(int episode: Anime.episodes){
            System.out.print(episode + " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
