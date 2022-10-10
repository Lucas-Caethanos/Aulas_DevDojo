package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Wrappers.Test;


public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //São objetos
        Byte byteW = 1;
        Short shortW = 1; //autoboxing
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("156456564"); //Tranformando string em outro valor (no caso integer)
        System.out.println(intW2);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('-'));
    }
}
