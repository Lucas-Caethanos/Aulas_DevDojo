package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Heranca.Dominio;

public class Funcionario extends Pessoa{ //Funcionario é uma pessoa - Ele é tudo que uma pessoa é, mais alguma coisa
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime(); //imprime da classe pessoa (super classe)
        System.out.println(salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " | " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
