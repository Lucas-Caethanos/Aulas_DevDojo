package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Introducao.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Introducao.Dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Ichigo";
        estudante.sexo = 'M';
        estudante.idade = 19;

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
