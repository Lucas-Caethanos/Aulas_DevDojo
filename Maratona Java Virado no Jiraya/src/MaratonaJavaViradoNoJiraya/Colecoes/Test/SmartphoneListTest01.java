package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import MaratonaJavaViradoNoJiraya.Colecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("2222","Pixel");
        Smartphone s3 = new Smartphone("3333","Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); //definido o index a ser ocopado

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("2222","Pixel"); //caso não encontre, retorna -1

        System.out.println(smartphones.contains(s4)); //executa o equals e compara o serialNumber

        int indexOf = smartphones.indexOf(s4);
        System.out.println(indexOf);


    }
}
