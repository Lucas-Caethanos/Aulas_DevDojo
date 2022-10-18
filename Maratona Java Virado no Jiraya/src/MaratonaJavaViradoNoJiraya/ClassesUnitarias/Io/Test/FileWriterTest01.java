package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Io.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Bleach voltou e os quicys são brabos \n hdfiuhdshfdshufuids \n fuhdashuifdsuhfuhdsihfuds");
            fw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
