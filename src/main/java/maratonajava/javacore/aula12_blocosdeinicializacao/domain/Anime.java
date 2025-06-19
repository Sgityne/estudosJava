package maratonajava.javacore.aula12_blocosdeinicializacao.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
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
        for(int episode: this.episodes){
            System.out.print(episode + " ");
        }
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
