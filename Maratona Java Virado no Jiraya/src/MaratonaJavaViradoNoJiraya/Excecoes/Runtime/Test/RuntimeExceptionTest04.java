package MaratonaJavaViradoNoJiraya.Excecoes.Runtime.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro de IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro de IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro de ArithmeticException");
        }catch (RuntimeException e){
            //Mais genérico -> Deve ficar no final para (as mais genéricas sempre vem no final)
            //É a classe pai das demais exception
            System.out.println("Dentro do RuntimeException");
        }
        try{
            talvezLanceException();
            //precisamos tratar todas as exception antes de compilar
        }catch (SQLException e){
            System.out.println("Tratando: SQLException");
        }catch (FileNotFoundException e){
            System.out.println("Tratando: FileNotFoundException");
        }//catch (IOException e){
//            System.out.println("Tratando: IOException mais genérica");
//        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{
        throw new SQLException();
    }
}
