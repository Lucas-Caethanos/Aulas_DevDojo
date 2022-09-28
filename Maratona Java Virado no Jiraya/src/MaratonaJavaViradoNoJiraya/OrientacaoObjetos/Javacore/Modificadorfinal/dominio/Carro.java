package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Modificadorfinal.dominio;

public class Carro {
    private String name;
    public static final double MAX_SPEED; //Constantes tem essa sintaxe
    static { //Bloco sempre será executado
        MAX_SPEED = 250;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
