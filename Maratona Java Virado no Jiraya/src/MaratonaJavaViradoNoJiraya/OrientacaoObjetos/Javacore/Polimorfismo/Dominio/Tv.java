package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Polimorfismo.Dominio;

public class Tv extends Produto {
    public static final double IMPOSTO = 0.21;

    public Tv(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.valor * IMPOSTO;
    }
}
