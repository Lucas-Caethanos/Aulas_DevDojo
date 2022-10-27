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
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Ichigo");
        nomes.add("Renji");
        nomes.remove("Renji"); //Pode receber um indice ou objeto, retorna true ou false
        nomes2.add("Rukia");
        nomes2.add("Kisuke Urahara");

        nomes.addAll(nomes2); //Colocando todos os elementos de uma List na outra

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }
        System.out.println(nomes);

    }
}
