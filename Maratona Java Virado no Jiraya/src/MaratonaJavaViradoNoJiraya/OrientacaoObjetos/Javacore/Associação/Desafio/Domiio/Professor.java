package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime(){
        System.out.println("--------------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocalNome().getEndereco());
            if (seminario.getEstudantes() == null  || seminario.getEstudantes().length == 0) continue;
            System.out.println("## Estudantes ##");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Nome: " + estudante.getNome() + " | Idade: " + estudante.getIdade());
                
            }

        }


    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
