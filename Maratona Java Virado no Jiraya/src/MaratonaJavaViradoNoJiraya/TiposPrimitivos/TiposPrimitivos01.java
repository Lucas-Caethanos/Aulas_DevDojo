package MaratonaJavaViradoNoJiraya.TiposPrimitivos;

public class TiposPrimitivos01 {
    /*
    Tipos Primitivos:
    -int
    -double
    -float
    -char
    -byte
    -short
    -long
    -boolean
     */

    public static void main(String[] args) {

        int age = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2008;
        float salarioFloat = 2500.01F; //Ajuda o programa a identificar o float
        byte idadeByte = 12;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'K';

        //O cast é vc forçar um valor maior em uma variável que não suporta seu tamanho
        // int age = (int) 10000000000000L; --> forçando um long em um int (pode dar erro ao complilar)

        String nome = "Um grande texto aqui..."; //String não é um tipo primitivo, é uma "Classe"

        var nome2 = 15;
        var nome3 = "Ichigo";
        // O var permite vc "ocultar" o tipo de variável. O sistema define com passe no tipo de dado que ela receber

        System.out.println("The age is " + age);
        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(nome);
        System.out.println(nome3);

    }
}
