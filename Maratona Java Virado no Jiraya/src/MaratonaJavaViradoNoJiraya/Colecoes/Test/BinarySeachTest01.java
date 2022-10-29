package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySeachTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(9);
        numeros.add(1);
        numeros.add(198);

        //(-(ponto de nserção) -1)

        Collections.sort(numeros);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("------------------");

        System.out.println(Collections.binarySearch(numeros, 5)); //retorna a posição do valor desejado, -1 de não encontrar
        System.out.println(Collections.binarySearch(numeros, 198));

















    }
}
