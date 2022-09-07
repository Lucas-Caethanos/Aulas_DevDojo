package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Test;
/*
Crie um sistema qu gerencie seminários

O sistema deverá cadastrar seminário, estudante, professor e local onde será realizado

Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá mínistrar vários seminários
Um seminário deve ter um local

Campos básicos (excluindo reacionamentos)
seminário: título
estudante: nome e idade
professor: nome, especialidade
local: endereço
 */
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio.Estudante;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio.Local;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio.Professor;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio.Seminario;

public class DesafioTest {
    public static void main(String[] args) {
        Local local = new Local("Karakura");
        Estudante estudante = new Estudante("Ichigo",19);
        Professor professor = new Professor("Urahara", "Shinigami");
        Estudante[] estudantesParaSeminario = {estudante};
        Seminario seminario = new Seminario("Como liberar a bankai", local, estudantesParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}

