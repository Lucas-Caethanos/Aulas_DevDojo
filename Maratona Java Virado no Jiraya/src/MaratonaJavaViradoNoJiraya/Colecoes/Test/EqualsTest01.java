package MaratonaJavaViradoNoJiraya.Colecoes.Test;

import MaratonaJavaViradoNoJiraya.Colecoes.Dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
//        String nome = "Ichigo"; //referência no pool string
//        String nome2 = new String("Ichigo"); //referência no Heap java
//        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("1ABC1","iPhone");
        Smartphone s2 = new Smartphone("1ABC1","Pixel");
        //Smartphone s2 = s1; //Agora todas as variáveis de referências referenciam o mesmo objeto

        System.out.println(s1.equals(s2)); //retorna false, pois estamos fazendo referencia para objetos diferentes(mesmo ees sendo idênticos)



    }
}
