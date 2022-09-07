package MaratonaJavaViradoNoJiraya.Operadores;

/*
Operadores básicos:
-Soma: +
-Subtração: -
-Divisão: /
-Multiplicação: *
 */

public class Operadores01 {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;
        double resultado = numero1 / (double) numero2;
        boolean isResultadoMairo = numero1 > numero2;
        boolean isResultadoMenor = numero1 < numero2;


        System.out.println(resultado);
        System.out.println(isResultadoMairo);
        System.out.println(isResultadoMenor);
    }
}
