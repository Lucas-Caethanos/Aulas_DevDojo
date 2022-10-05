package MaratonaJavaViradoNoJiraya.Excecoes.Runtime.Test;

/**
 * Checked - precisamos tratar <br>
 * Unchecked - não precisamos tratar
 */
public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString());
        //Vai gerar um NullPointerException

    }
}
