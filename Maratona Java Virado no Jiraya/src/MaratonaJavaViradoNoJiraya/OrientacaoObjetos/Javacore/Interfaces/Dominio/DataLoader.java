package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio;

import java.net.PortUnreachableException;

public interface DataLoader {
    //Todos os métodos aqui são public e abstract

    int Max_data_size = 10;

    void load();
    default void checkPermition(){
        System.out.println("Fazendo chcagem de permissões");
    }
    public static void retriveMaxDataSize(){
        System.out.println("Dentro da interface");
    }

}
