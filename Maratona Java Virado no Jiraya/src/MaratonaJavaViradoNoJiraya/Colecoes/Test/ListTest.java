package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //Tamanhos começa com 16 "espaços" e vai dobrando a portir disso
//        List nomes = new ArrayList(); //Versão antiga -> aceita qualquer valor
//        nomes.add("Ichigo");
//        nomes.add("Renji");
//        nomes.add(1233);

        List<String> nomes = new ArrayList<>(16);
        nomes.add("Ichigo");
        nomes.add("Renji");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }

    }
}
