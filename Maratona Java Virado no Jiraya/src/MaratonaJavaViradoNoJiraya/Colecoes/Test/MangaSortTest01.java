package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import MaratonaJavaViradoNoJiraya.Colecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangByIdComparator implements Comparator<Manga> {
    //Sobrescrevendo a bunca -> por busca por id
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }

}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6); //Fazendo um array de objetos da classe Mangas
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(12L, "Jujutsu kaisen", 199.9));
        mangas.add(new Manga(9L, "Attack on Titan", 51.9));
        mangas.add(new Manga(4L, "Bleach", 23.9));

        //System.out.println(mangas);

        Collections.sort(mangas); //Fazendo o sort (colocar em ordem)
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("---------------------------------------");

        Collections.sort(mangas, new MangByIdComparator()); //sobrescrevendo as configurações do sort
        // mangas.sort(new MangByIdComparator()); assim tembém funciona
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
