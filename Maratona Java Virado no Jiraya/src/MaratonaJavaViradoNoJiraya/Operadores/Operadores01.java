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

        System.out.println("////////////////////////////////////////////////////////////");
        //%
        int rest = 21 % 7;
        System.out.println(rest);

        System.out.println("////////////////////////////////////////////////////////////");
        //Operadores de comparação:
        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenDifferentTwenty = 10 == 20;

        System.out.println(isTenGreaterThanTwenty);
        System.out.println(isTenSmallerThanTwenty);
        System.out.println(isTenEqualsTwenty);
        System.out.println(isTenDifferentTwenty);

        System.out.println("////////////////////////////////////////////////////////////");
        //Operadores lógicos
        //&& (AND), || (OR), !(Negação)
        int age = 35;
        float wage = 3500F;
        boolean isInTheLaw = age > 30 && wage > 4612;

        System.out.println(isInTheLaw);



    }
}
