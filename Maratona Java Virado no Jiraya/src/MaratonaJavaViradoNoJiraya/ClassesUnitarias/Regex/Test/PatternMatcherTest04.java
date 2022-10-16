package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
//? zero ou uma
        //* zero ou mais
        //+ uma ou mais
        //{n,m} de n até m
        //()
        // | o(v|c) -> ocorrências como ovo e oco
        //$ fim da linha

        String regex = "0[xX]([\\dA-Fa-f])+(\\s|$)";


        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
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
