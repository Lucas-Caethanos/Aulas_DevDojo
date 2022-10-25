package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Serializacao.Test;

import MaratonaJavaViradoNoJiraya.ClassesUnitarias.Serializacao.Dominio.Aluno;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno =  new Aluno(1L, "Goku","123456");


    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
