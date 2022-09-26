package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;
/**
 * age < 15 - infantil<br>
 * age >= 15 && idade <18 - juvenil<br>
 * age >= 18 - adulto
 */
public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 15;

        if (age < 15) {
            System.out.println("Infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }
}
