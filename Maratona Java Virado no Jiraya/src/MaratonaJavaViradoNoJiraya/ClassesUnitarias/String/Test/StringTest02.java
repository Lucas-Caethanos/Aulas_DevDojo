package MaratonaJavaViradoNoJiraya.ClassesUnitarias.String.Test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "    Luffy  ";
        String num = "121345";

        System.out.println(nome.charAt(0)); //começa do 0, 1, 2, 3... - atua como um array
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.substring(0,2)); //indice exclusivo (não conta o extremo)
        System.out.println(num.substring(0));
        System.out.println(nome.trim()); //retira a parte em branco antes e depois da String

    }
}
