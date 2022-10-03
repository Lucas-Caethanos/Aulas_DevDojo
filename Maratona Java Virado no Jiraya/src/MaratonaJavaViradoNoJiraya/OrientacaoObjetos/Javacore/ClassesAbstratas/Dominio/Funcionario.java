package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio;

public abstract class Funcionario {
    protected String name;
    protected double wage;

    public Funcionario(String name, double wage) {
        this.name = name;
        this.wage = wage;
        calculaBonus();
    }
    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
