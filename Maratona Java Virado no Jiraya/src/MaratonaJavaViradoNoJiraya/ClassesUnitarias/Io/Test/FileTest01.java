package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Io.Test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("Path " + file.getPath());

            boolean exist = file.exists();

            if(exist){
                System.out.println("Deleted " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
