package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Test;

import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Dominio.Cliente;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Dominio.TipoCliente;
import MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.Enumeracao.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ichigo", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        //Cliente cliente2 = new Cliente("Renji", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Gotei 13", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        //Cliente cliente4 = new Cliente("Onmitukido", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        //System.out.println(cliente2);
        System.out.println(cliente3);
        //System.out.println(cliente4);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("PESSOA_JURIDICA");
        System.out.println(tipoCliente2);

    }
}
