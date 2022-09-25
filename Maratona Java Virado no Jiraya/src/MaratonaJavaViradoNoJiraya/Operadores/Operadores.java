package MaratonaJavaViradoNoJiraya.Operadores;

public class Operadores {
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

        double amountC1 = 200F;
        double amountC2 = 10000F;
        double playstation5Value = 5000F;
        boolean isPlaystation5Buyable = amountC1 > playstation5Value || amountC2 > playstation5Value;

        System.out.println(isPlaystation5Buyable);

        System.out.println("////////////////////////////////////////////////////////////");
        //Operadores de atribuição
        //= += -= *= /= %=
        double bonus = 1800;
        //bonus = bonus + 100;
        bonus += 1000;
        bonus *= 2;
        bonus /= 4;

        System.out.println(bonus);

        System.out.println("////////////////////////////////////////////////////////////");
        //++ --
        int counter = 0;
        counter += 1;
        counter++; //counter++ -> imprime e depois opera
        ++counter; //++counter -> opera e depois imprime

        System.out.println(counter);

    }
}
