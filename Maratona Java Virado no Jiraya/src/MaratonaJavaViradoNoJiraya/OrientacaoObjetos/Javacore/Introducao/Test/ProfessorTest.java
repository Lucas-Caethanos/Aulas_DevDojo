package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Introducao.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Introducao.Dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Urahara";
        prof.idade = 350;
        prof.sexo = 'M';

        System.out.println(prof.nome + " | " + prof.sexo + " | " + prof.idade);
    }
}
