package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Construtores.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Construtores.Dominio.Anime;

//Sobrecarga de métodos é você reescrever um método como um de nome igual, mas parametros diferentes
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach","TV",256,"Shounen");

        anime.imprime();
    }
}
