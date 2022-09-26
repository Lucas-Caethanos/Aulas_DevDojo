package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;


public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Donate if wage > 5000;
        double wage = 4000;

        //String donationMenssage = "Eu vou doar";
        //String nonDonateMenssage = "Eu não vou doar";

        //Operador ternário --> (condicao) ? verdadeiro : falso
        String resultado = wage > 5000 ? "Eu vou doar" : "Eu não vou doar";
/*
        if(wage > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }

 */
        System.out.println(resultado);
    }
}
