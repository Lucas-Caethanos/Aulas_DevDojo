package MaratonaJavaViradoNoJiraya.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //O tamanho do Array não pode ser mudado dinamicamente
        String[] name = new String[4];
        name[0] = "Kurosaki";
        name[1] = "Ana";
        name[2] = "Naruto";
        name[3] = "Byakuya";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

    }
}
