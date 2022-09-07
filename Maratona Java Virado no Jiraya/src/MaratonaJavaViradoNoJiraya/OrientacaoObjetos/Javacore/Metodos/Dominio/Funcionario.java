package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.print("| ");
        for (double salario: salarios){
            System.out.print(salario + " | ");
        }
    }
    public void media(){

        double media = 0;

        for(double salario: salarios){
            media += salario;
        }
        System.out.println();
        System.out.println("A média salarial é de: " + media / salarios.length);
    }
}
