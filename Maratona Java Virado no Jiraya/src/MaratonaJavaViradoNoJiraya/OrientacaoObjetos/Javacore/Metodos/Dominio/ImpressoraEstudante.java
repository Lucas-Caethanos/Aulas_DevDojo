package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio;

public class ImpressoraEstudante {
    //Quando se passa um objeto por argumento/método vc está passando uma reverência de onde o objeto está
    //Pomos ter várias referências para o mesmo objeto

    public void imprimir(Estudante estudante){

        System.out.println("-----------------------------------------------------------");

        //estudante.nome = "Kakashi"; Rescrevendo o valor estudante.nome (alterando o estado do objeto)
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("****************************************");

        estudante.nome = "Kakashi";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }

}
