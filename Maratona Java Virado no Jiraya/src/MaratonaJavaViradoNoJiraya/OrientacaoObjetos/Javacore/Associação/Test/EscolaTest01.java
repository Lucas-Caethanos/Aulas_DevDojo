package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio.Escola;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores); //Relaciona scola com professor (estando em array)

        escola.imprime();
    }
}
