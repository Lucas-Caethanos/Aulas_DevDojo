package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorized = age >= 18;
        /*
                  if (isAutorizado) {
                      System.out.println("Autorizado");
                  }
                  ! é o operador de negação
                  if (!isAutorizado) {
                      System.out.println("Não autorizado");
                  }
         */

        if (isAuthorized) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

    }
}
