package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Repositorio.Repositorio;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Servico.RepositorioBancoDeDados;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        //fazebdo a implementação apenas tracando o objeto
//      Repositorio repositorio= new RepositorioMemoria();
        Repositorio repositorio= new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
