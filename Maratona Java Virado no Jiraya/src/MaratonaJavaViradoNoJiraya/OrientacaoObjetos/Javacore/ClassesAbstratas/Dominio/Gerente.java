package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String name, double wage) {
        super(name, wage);
    }

    @Override
    public void calculaBonus() {
        wage = wage + (wage * 0.05);
    }
}
