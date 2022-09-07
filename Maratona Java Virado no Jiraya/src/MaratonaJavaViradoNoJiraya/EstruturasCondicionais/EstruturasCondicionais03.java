package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;


public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000;
        double salario = 4000;

        //String mensagemDoar = "Eu vou doar";
        //String mensagemNaoDoar = "Eu não vou doar";

        //Operador ternário --> (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar" : "Eu não vou doar";
/*
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }

 */
        System.out.println(resultado);
    }
}
