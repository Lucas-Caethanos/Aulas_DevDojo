package MaratonaJavaViradoNoJiraya.Operadores;

public class Operadores01 {
    /**
     * <b>Operadores básicos</b>:<br>
     * Soma (+), Subtração (-), Divisão (/), Multiplicação (*)
     */
    public static void main(String[] args) {

        int number1 = 13;
        int number2 = 5;
        double result = number1 / (double) number2;
        boolean isBiggestResult = number1 > number2;
        boolean isSmallestResult = number1 < number2;

        System.out.println(result);
        System.out.println(isBiggestResult);
        System.out.println(isSmallestResult);


    }
}
