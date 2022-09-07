package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.BlocosDeInicializacao.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.BlocosDeInicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}
