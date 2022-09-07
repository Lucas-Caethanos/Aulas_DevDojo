package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("-------");
        calc.subtraiDoisNumeros();
    }
}
