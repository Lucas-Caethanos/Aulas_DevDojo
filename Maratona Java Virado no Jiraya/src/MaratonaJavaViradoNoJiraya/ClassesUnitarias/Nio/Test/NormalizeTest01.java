package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Nio.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "C:\\Users\\lucas\\OneDrive\\Área de Trabalho\\IdeaProjects\\Aulas_DevDojo\\Maratona Java Virado no Jiraya\\pasta2\\subPasta\\subSubPasta";
        String arquivoTxt = "../../Arquivodev.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);

        System.out.println(path1);
        System.out.println(path1.normalize());


    }
}
