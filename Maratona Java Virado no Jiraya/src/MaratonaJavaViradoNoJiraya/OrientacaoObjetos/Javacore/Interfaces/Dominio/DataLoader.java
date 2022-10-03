package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio;

public interface DataLoader {
    //Todos os métodos aqui são public e abstract

    void load();
    default void checkPermition(){
        System.out.println("Fazendo chcagem de permissões");
    }

}
