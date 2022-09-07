package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ichigo");
        pessoa.setIdade(19);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("--------------------------");
        pessoa.imprime();
    }
}
