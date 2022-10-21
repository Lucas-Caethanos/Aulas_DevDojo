package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Nio.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        var pastaPath = Paths.get("pasta2\\subPasta\\subSubPasta");
        if(Files.notExists(pastaPath)){
            var pastaDirectory = Files.createDirectory(pastaPath);
        }

        Path filePath = Paths.get(pastaPath.toString(), "arquivo.txt");
        if(Files.notExists(filePath)){
            var filePathCreated = Files.createFile(pastaPath);
        }

    }
}
