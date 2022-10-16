package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex); //Define um padrão (para ser usado em uma pesquisa)
        Matcher matcher = pattern.matcher(texto2); //Usada para procurar o padrão

        System.out.println("Texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }


    }
}
