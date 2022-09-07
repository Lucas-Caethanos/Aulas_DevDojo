package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;

        /*
        if (isAutorizado) {
            System.out.println("Autorizado");
        }
        // ! é o operador de negação
        if (!isAutorizado) {
            System.out.println("Não autorizado");
        }
        */
        if (isAutorizado) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

    }
}
