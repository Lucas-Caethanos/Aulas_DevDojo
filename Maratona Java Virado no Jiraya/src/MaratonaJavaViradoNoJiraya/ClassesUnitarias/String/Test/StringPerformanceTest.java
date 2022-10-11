package MaratonaJavaViradoNoJiraya.ClassesUnitarias.String.Test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(300_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (fim - inicio) + "ms");

//        inicio = System.currentTimeMillis();
        concatStringBuilder(300_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo total Builder: " + (fim - inicio) + "ms");

        concatStringBuffer(300_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo total Buffer: " + (fim - inicio) + "ms");

    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //cada iteração vai criar uma nova String, pois elas são imutáveis
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
