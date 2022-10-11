package MaratonaJavaViradoNoJiraya.ClassesUnitarias.String.Test;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        String nome = "Ichigo Kurosaki";
        nome = nome.concat(" Shinigami Substituto");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Ichigo Kurosaki");
        sb.append(" Shinigami").append(" Substituto");
        sb.reverse();
        System.out.println(sb);
    }
}
