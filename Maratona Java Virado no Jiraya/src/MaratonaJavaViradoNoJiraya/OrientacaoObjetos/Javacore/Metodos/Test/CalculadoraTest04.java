package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;


import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2); //variável que veio com referência da classe (não será alterada)
        System.out.println("Fora do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }
}
