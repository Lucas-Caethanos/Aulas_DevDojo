package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Servico;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Computador;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Produto;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador){
//        double imposto = computador.calcularImposto();
//        System.out.println("Relatório de imposto do computador:");
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto " + imposto);
//    }
//    public static void calcularImpostoTomate(Tomate tomate){
//        double imposto = tomate.calcularImposto();
//        System.out.println("Relatório de imposto do tomate:");
//        System.out.println("Tomate " + tomate.getNome());
//        System.out.println("Valor " + tomate.getValor());
//        System.out.println("Imposto " + imposto);
//    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto pago: " + imposto);

        if(produto instanceof Tomate){
            //Tomate tomate = (Tomate) produto;

            System.out.println(((Tomate) produto).getDataValidade());
        }

    }
}
