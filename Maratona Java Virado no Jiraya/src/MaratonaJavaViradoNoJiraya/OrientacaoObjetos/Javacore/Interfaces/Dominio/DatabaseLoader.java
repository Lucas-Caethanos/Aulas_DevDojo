package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo banco de dados...");
    }

    @Override
    public void checkPermition() {
        System.out.println("Checando as permições no banco de dados...");
    }
}
