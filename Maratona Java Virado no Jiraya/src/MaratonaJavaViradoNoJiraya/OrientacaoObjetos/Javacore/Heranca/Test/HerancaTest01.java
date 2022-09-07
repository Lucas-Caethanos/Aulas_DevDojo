package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Heranca.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Heranca.Dominio.Endereco;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Heranca.Dominio.Funcionario;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Heranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Soul Society");
        endereco.setCep("46568952-4512");
        Pessoa pessoa = new Pessoa("Okita Souji");
        pessoa.setCpf("123654658122");
        pessoa.setEndereco(endereco); //Colocando a referênciapara a classe endereço


        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("158545");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------------");
        funcionario.imprime();
    }
}
