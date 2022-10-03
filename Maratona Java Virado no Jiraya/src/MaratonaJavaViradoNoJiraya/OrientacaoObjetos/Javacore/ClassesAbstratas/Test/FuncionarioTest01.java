package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio.Desenvolvedor;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio.Funcionario;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Zoro", 2000);
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);


        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
