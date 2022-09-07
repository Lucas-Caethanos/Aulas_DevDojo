package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio;

public class Estudante {

    private String nome;
    private int idade;
    private String seminarioTitulo;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSeminarioTitulo() {
        return seminarioTitulo;
    }

    public void setSeminarioTitulo(String seminarioTitulo) {
        this.seminarioTitulo = seminarioTitulo;
    }
}
