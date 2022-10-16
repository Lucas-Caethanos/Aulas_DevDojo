package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        //[]
//        String regex = "[a-zA-C]"; // \s espaços em branco

        String regex = "0[xX][\\dA-Fa-f]";

        //   String texto = "aba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex); //Define um padrão (para ser usado em uma pesquisa)
        Matcher matcher = pattern.matcher(texto2); //Usada para procurar o padrão

        System.out.println("Texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
//        int numeroHex = 0x59F86A; //Usamos 0x para avisar ao Java que isso é um número hexadecimal
//        System.out.println(numeroHex);


    }
}
