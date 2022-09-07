package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio;

public class Time {
    //Não tenho nenhuma referencia a classe Jogador
    //Relação unidirecional muitos para um
    //Mutos jogadores podem ter um time
    private String name;
    private Jogador[] jogadores;

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public Time(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(this.name);
        if (jogadores == null) {
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
