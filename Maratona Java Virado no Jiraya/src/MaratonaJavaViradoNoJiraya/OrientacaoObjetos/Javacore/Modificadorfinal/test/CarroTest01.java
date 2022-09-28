package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();


        System.out.println(Carro.MAX_SPEED);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setName("Naruto");
        System.out.println(carro.COMPRADOR);

    }
}
