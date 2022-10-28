package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Jujutsu kaisen");
        mangas.add("Attack on Titan");
        mangas.add("Bleach");
        Collections.sort(mangas); //deixou em oredem alfabética

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D); //Forçando um cast
        dinheiros.add(98.10);

        Collections.sort(dinheiros); //deixando em ordem


        for (String manga : mangas) {
            System.out.println(manga);

        }
        System.out.println("---------------------");

        System.out.println(dinheiros);

    }
}
