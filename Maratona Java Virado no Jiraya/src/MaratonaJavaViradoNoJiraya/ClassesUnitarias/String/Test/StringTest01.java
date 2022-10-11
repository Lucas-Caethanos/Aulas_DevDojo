package MaratonaJavaViradoNoJiraya.ClassesUnitarias.String.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; //String costant pool
        String nome2 = "William";

        nome = nome.concat(" Suane"); //ao fazer a concatenação criamos um novo objeto e, por isso, precisamos referenciá-lô

        System.out.println(nome);
        System.out.println(nome == nome2); //Fazem referência a o mesmo objeto (do tipo String) dentro do pool string
        String nome3 = new String("William");
        //Criando uma variável de referência - criando um objeto do tipo String - criando uma string no pool de Strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); //retornando a referência ao pool
    }
}

