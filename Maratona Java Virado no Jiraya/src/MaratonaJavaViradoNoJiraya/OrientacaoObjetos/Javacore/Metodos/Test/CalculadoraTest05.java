package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        System.out.println("------------------------------");
        calc.somaVarArgs("Bruno",1,2,3,4,5);
    }
}
