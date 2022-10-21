package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Nio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        //Path p1 = Paths.get("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\IdeaProjects\\Aulas_DevDojo\\Maratona Java Virado no Jiraya\\file.txt");
        Path p1 = Paths.get("C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\IdeaProjects\\Aulas_DevDojo\\Maratona Java Virado no Jiraya", "file.txt");
        //Podemos passar o caminho em vários argimentos ou em um único

        System.out.println(p1.getFileName());


    }
}
