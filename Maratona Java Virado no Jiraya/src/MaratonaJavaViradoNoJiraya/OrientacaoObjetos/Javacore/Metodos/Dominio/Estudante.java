package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //Não há necessidade de parâmetros, pois estamos na classe Estudante
    public  void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}
