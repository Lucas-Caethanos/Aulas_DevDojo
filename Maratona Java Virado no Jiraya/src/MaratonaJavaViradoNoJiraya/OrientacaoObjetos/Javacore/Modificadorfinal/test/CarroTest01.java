package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.dominio.Carro;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();


        System.out.println(Carro.MAX_SPEED);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setName("Naruto");
        System.out.println(carro.COMPRADOR);
        ferrari.setName("Carlos");
        ferrari.imprime();

    }
}
