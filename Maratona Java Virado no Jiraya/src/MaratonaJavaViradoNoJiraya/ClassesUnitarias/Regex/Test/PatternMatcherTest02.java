package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //String regex = "\\d"; // \d -> buca todos os dígitos
        //String regex = "\\D"; // \d -> o que não for dígito (não número)
        String regex = "\\s"; // \s espaços em branco

        //   String texto = "aba";
        String texto2 = "hhj$2 12&gvh21_k h2!";
        Pattern pattern = Pattern.compile(regex); //Define um padrão (para ser usado em uma pesquisa)
        Matcher matcher = pattern.matcher(texto2); //Usada para procurar o padrão

        System.out.println("Texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
