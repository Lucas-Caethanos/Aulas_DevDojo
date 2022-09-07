package MaratonaJavaViradoNoJiraya.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        /*
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1};
        arrayInt[1] = new int[]{1, 2};
        arrayInt[2] = new int[]{1, 5, 8, 5};
         */
        int[][] arrayInt = {{1}, {1, 2}, {1, 2, 3, 4}};

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
