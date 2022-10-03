package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Interfaces.Dominio;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando banco de dados...");
    }
}
