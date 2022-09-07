package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Associação.Desafio.Domiio;

public class Seminario {
    private String titulo;
    private Local localNome;
    private Estudante[] estudantes;

    public Seminario(String titulo, Local localNome, Estudante[] estudantes) {
        this.titulo = titulo;
        this.localNome = localNome;
        this.estudantes = estudantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocalNome() {
        return localNome;
    }

    public void setLocalNome(Local localNome) {
        this.localNome = localNome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
