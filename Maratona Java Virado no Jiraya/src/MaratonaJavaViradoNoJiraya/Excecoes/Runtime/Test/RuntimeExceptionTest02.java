package MaratonaJavaViradoNoJiraya.Excecoes.Runtime.Test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println( divisao(10,2));
    }

    /**
     *
     * @param a
     * @param b Não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

//        try{
//            return a/b;
//
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
        //return 0;
        return a/b;
    }
}
