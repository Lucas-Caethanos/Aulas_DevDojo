package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Dominio;

import javax.sound.midi.Soundbank;

public class Escola {
    //Relação: Uma escola pode ter varios professores
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null){
            return;
        }
        for (Professor professor : professores) {
            System.out.println(professor.getName());
        }

    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
