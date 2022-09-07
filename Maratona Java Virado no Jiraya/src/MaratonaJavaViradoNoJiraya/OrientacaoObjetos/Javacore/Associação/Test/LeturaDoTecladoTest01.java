package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Test;

import java.util.Scanner;

public class LeturaDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá, " + nome + "!");

        System.out.print("Digite o seu sxo: ");
        char sexo = input.next().charAt(0);
        System.out.println("Você é: " + sexo);

    }
}
