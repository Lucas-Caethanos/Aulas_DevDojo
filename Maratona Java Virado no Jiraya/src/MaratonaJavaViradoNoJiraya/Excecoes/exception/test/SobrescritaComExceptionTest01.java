package MaratonaJavaViradoNoJiraya.Excecoes.exception.test;

import MaratonaJavaViradoNoJiraya.Excecoes.exception.dominio.Funcionario;
import MaratonaJavaViradoNoJiraya.Excecoes.exception.dominio.LoginInvalidoException;
import MaratonaJavaViradoNoJiraya.Excecoes.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
