package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ModificadoresEstaticos.Dominio;

public class Anime {
    static private String nome;
    static private int[] episodios;
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória para objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passaso
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    static {//Executado apenas uma vez
        System.out.println("Dentro do bloco de inicialização"); //Bloco de incialização
        episodios = new int[24];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Outro bloco de inicalização estático");
    }

    public Anime(String nome) { //Construtor
        this.nome = nome;
    }

    public Anime() {
        for (int ep : this.episodios) {
            System.out.print(ep + " | ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
