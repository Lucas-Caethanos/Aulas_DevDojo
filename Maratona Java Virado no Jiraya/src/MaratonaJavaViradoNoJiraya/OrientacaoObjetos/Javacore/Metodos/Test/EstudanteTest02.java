package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Renji";
        estudante1.idade = 250;
        estudante1.sexo = 'M';

        estudante2.nome = "Rukia";
        estudante2.idade = 234;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
