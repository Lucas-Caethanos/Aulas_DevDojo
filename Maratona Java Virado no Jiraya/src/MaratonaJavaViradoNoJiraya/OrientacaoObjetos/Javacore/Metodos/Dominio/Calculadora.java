package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Metodos.Dominio;

public class Calculadora {

    public void somaDoisNumeros() { //Não retorna valores
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(50 - 15);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }

    }

    public void imprimeDivisaoDeDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; //funciona com um break
        }
        System.out.println(num1 / num2);


    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(String nome, int...numeros){
        //Transforma vários argumentos em um array
        //Pode receber outros valores como String, mas o "int..." precisa ser o último argumento dado
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(nome);
        System.out.println(soma);

    }
}
