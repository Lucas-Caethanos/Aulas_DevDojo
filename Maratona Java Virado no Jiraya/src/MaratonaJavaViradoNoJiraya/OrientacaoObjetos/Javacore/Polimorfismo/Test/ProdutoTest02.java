package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Computador;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Produto;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto1 = new Tomate("Tomate 2",15);

        System.out.println(produto);
        System.out.println(produto1);
        System.out.println(produto.getNome());

    }
}
