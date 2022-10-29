package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import MaratonaJavaViradoNoJiraya.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySeachTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6); //Fazendo um array de objetos da classe Mangas
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(12L, "Jujutsu kaisen", 199.9));
        mangas.add(new Manga(9L, "Attack on Titan", 51.9));
        mangas.add(new Manga(4L, "Bleach", 23.9));


        mangas.sort(new MangByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(5L, "Hellsing Ultimate", 19.9);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
