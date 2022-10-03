package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Computador;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Tomate;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7",11000);
        Tomate tomate = new Tomate("Tomate 1",15);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
