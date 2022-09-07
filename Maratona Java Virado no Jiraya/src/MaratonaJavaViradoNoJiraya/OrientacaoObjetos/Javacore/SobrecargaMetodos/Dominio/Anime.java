package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.SobrecargaMetodos.Dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String name, String tipo, int episodios){
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String name, String tipo, int episodios, String genero){
        this.init(name, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
