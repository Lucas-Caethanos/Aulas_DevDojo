package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Io.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDirtorio = new File("pasta");
        boolean isDiretorioCriado = fileDirtorio.mkdir();
        System.out.println(isDiretorioCriado);

        File fileArquiDiretorio = new File(fileDirtorio, "arquivo2.txt"); //fileDirtorio é um parâmetro para se criar o arquivo
        try {
            boolean isFileCriado = fileArquiDiretorio.createNewFile();
            System.out.println(isFileCriado);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File filRenamed = new File(fileDirtorio,"arquivo_renomeado2.txt"); //fileDirtorio é um parâmetro para se criar o arquivo
        boolean isRenamed = fileArquiDiretorio.renameTo(filRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta_renomeada");
        boolean isDiretorioRenamed = fileArquiDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);

    }
}
