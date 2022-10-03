package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio.DatabaseLoader;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio.FilelLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FilelLoader filelLoader = new FilelLoader();

        databaseLoader.load();
        databaseLoader.remove();
        databaseLoader.checkPermition();
        System.out.println("----------------------");
        filelLoader.load();
        filelLoader.remove();
        filelLoader.checkPermition();

    }
}
