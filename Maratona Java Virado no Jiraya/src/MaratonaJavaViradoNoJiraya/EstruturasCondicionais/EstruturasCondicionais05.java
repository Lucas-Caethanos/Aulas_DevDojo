package MaratonaJavaViradoNoJiraya.EstruturasCondicionais;

public class EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo
        byte day = 8;

        //Só pode usar variáveis do tipo char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7, 8, 9:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Erro");
                break;

        }

    }
}
