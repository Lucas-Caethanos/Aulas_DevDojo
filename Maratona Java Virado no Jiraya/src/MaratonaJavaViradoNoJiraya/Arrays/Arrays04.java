package MaratonaJavaViradoNoJiraya.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int[][] day = new int[3][3];

        day[0][0] = 1;
        day[0][1] = 2;
        day[0][2] = 3;

        day[1][0] = 4;
        day[1][1] = 5;
        day[1][2] = 6;

        day[2][0] = 15;
        day[2][1] = 8;
        day[2][2] = 9;
/*
        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < day[i].length; j++) {
                System.out.println(day[i][j]);
            }
        }

 */
        for (int[] ints : day) { //Forma reduzida
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

    }
}
