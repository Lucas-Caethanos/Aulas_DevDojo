package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio;

public class FilelLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivo...");
    }
    @Override
    public void checkPermition() {
        System.out.println("Checando as permições no arquivo...");
    }
}
