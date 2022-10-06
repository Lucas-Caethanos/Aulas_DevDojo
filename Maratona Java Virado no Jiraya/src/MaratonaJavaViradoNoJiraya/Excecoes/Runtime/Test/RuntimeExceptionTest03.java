package MaratonaJavaViradoNoJiraya.Excecoes.Runtime.Test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();

    }
    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            //throw new RuntimeException();
            System.out.println("Escrevendo no arquivo");
            return "conexão aberta";
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            //Sempre executado indepndente do try/catch
            System.out.println("Fechando arquivo liberado pelo SO");
        }
        return null;
    }
}
