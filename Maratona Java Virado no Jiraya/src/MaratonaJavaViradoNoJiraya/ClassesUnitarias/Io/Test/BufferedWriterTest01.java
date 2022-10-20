package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Io.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)) {
            fw.write("Bleach voltou e os quicys são brabos");
            fw.flush();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
