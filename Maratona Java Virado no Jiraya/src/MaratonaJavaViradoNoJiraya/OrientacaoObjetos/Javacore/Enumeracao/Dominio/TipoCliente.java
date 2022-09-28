package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Dominio;

/**
 * Nessa classe os atributos são constantes<br>
 * PESSOA_FISICA<br>
 * PESSOA_JURIDICA
 */
public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
