package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 - infantil
        //idade >= 15 && idade <18 - juvenil
        //idade >= 18 - adulto

        int idade = 15;

        if (idade < 15) {
            System.out.println("Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }
}
