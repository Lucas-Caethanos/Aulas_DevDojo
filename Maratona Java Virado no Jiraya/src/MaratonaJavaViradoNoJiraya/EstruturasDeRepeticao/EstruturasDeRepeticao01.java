package MaratonaJavaViradoNoJiraya.EstruturasDeRepeticao;

public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
//while, do while, for

        int count = 0;
        while (count < 10) {
            System.out.println("Dentro do 'while' " + (++count));
        }

        do {
            System.out.println("Dentro do 'do while' " + (++count));
        } while (count < 20);

        for (int i = 21; i <= 50; i++){
            System.out.println("Dentro do 'for' " + i);
            if(i >= 30){
                System.out.println("Usando um break");
                break; //encerra o laço de repetiçõa
                //continue; --> Sai do if, mas continua no for
            }
        }
    }


}
