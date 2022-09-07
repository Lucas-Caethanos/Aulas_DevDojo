package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario();

        fun1.nome = "Byakuya";
        fun1.idade = 250;
//        fun1.salarios = new double[]{1200, 1200.546, 1200, 800};

        fun1.imprime();
        fun1.media();
    }
}
