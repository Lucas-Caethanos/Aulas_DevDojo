package MaratonaJavaViradoNoJiraya.OrientacaoObjetos.Javacore.ClassesAbstratas.Dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double wage) {
        super(name, wage);
    }

    @Override
    public void calculaBonus() {
        wage = wage + (wage * 0.01);
    }
}
