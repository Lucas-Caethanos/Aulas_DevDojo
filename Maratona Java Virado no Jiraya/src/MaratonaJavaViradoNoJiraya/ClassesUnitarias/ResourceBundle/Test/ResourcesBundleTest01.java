package MaratonaJavaViradoNoJiraya.ClassesUnitarias.ResourceBundle.Test;


import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("Blech"));

        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "Br"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("Blech"));

        //Locale("fr", "CA");
        //Ocorre buscas por arquivos semelhantes caso a

    }
}
