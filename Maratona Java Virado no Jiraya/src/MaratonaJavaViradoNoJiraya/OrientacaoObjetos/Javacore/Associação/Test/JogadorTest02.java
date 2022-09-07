package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio.Jogador;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
