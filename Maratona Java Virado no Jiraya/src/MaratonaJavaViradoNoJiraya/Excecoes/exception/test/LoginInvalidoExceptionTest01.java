package MaratonaJavaViradoNoJiraya.Excecoes.exception.test;

import MaratonaJavaViradoNoJiraya.Excecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String username = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário: ");
        String userNameDigitado = scanner.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = scanner.nextLine();
        if (!username.equals(userNameDigitado) || !senhaDB.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso");

    }
}
