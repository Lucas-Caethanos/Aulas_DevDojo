package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Construtores.Dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String name, String tipo, int episodios, String genero) {
        this(); // Tem que ser a primeira linha do construtor
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(){
        System.out.println("Dentro de um outro contrutor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


}
