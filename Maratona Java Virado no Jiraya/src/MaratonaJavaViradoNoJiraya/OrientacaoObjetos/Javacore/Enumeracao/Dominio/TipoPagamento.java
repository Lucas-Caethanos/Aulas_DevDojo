package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor); //Um método criado para ser sobrescrito, a sobrescrita se torna obrigatória
}