package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.SobrecargaMetodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.SobrecargaMetodos.Dominio.Anime;

//Sobrecarga de métodos é você reescrever um método como um de nome igual, mas parametros diferentes
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //Podemos criar outro método para não alterar o contrato do método init

        //anime.init("Bleach", "TV",256); método antigo

        anime.init("Bleach", "TV",256, "Shounen");//método novo que ngloba o antigo

        /*
        anime.setName("Bleach");
        anime.setTipo("TV");
        anime.setEpisodios(256);
        */

        anime.imprime();


    }
}
