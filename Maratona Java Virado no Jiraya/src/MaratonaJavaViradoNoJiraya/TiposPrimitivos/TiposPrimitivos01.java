package MaratonaJavaViradoNoJiraya.TiposPrimitivos;

/**
 * Isso é um <b>Javadoc</b><br>
 * Pode ser acessado com ctrl + alt + Q.<br>Aqui aceitamos HTML
 */
public class TiposPrimitivos01 {

    /**
     * <b>Tipos Primitivos</b>: int, double, float, char, byte, short, long, boolean
     */
    public static void main(String[] args) {

        int age = 10;
        long largeNumber = 100000;
        double wageDouble = 2008;
        float wageFloat = 2500.01F; //Ajuda o programa a identificar o float!
        byte ageByte = 12;
        short ageShort = 10;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        char character = 'K'; //O carácter traduz para a tabela ASCII

        //O cast é vc forçar um valor maior em uma variável que não suporta seu tamanho.
        // int age = (int) 10000000000000L; --> forçando um long em um int (pode dar erro ao complilar).

        String nome = "Um grande texto aqui..."; //String não é um tipo primitivo, é uma "Classe"

        var nome2 = 15;
        var nome3 = "Ichigo";
        // O var permite vc "ocultar" o tipo de variável. O sistema define com passe no tipo de dado que ela receber

        System.out.println("The age is " + age);
        System.out.println(character);
        System.out.println(trueBoolean);
        System.out.println(falseBoolean);
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome3);


    }
}
