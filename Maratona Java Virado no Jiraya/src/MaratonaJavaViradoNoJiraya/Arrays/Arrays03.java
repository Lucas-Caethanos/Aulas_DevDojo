package MaratonaJavaViradoNoJiraya.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] number = new int[3];
        int[] number2 = {1, 2, 3, 9, 5, 45, 59}; //Incializando com o tamanho e os valores
        int[] number3 = new int[]{5, 4, 3, 2, 1};

        /*
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        */

        for (int array : number3) { //Forma simplificade de escrever o 'for'
            System.out.println(array);
        }
    }
}
