package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";


        String texto = "Ichigo@gmail.com, Zaraki@hotmail.com, rukia@hotogo, rengilsoul@mail.mail, soulsociety@sereitei.com";
        System.out.println("rukia@hotogo.bbb".matches(regex));
        Pattern pattern = Pattern.compile(regex); //Define um padrão (para ser usado em uma pesquisa)
        Matcher matcher = pattern.matcher(texto); //Usada para procurar o padrão

        System.out.println("Texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }


    }
}
