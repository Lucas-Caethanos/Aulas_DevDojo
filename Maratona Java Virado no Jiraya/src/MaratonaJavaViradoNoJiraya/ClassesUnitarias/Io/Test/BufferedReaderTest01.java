package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Io.Test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            String linha;

            while ((linha = br.readLine()) != null){ //Ler a linha, no final é retornado um valor null
                System.out.println(linha);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
