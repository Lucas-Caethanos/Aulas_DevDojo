package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Estudante;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        ImpressoraEstudante imp = new ImpressoraEstudante();
        estudante1.nome = "Renji";
        estudante1.idade = 250;
        estudante1.sexo = 'M';

        estudante2.nome = "Rukia";
        estudante2.idade = 234;
        estudante2.sexo = 'F';

        imp.imprimir(estudante1);
        imp.imprimir(estudante2);



    }
}
