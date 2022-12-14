package MaratonaJavaViradoNoJiraya.Colecoes.Dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    /**
     * Regras: <br>
     * Reflexivo: x.equals(x) tem que que ser true para tudo que for diferente de null <br>
     * Simétrico: para x e y diferente de null, se x.equals(y) == true logo, y.equals(x) == true <br>
     * Transitividade: para x, y, z diferente de null, se x. equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true <br>
     * Consistente: x.equals(x) sempre retorna true se x fordiferente de null <br>
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; //objeto nulo retorna falso

        if(this == obj) return true; //se as referencias do objeto são iguais (entaõ se trata do mesmo objeto) retorna true

        if(this.getClass() != obj.getClass()) return false; //Verifica a classe do objeto
        Smartphone smartphone = (Smartphone) obj; //Cast do objeto smarphone para obj

        return serialNumber != null && serialNumber.equals(smartphone.serialNumber); //Verificação do equals
    }

    /** Regras:<br>
     * Se x.equals(y) == true, y.hashCode() == x.hashCode()
     * y.hashCode() == x.hashCode() não necessariamente o y.equals(x) é true
     * x.equals(y) == false
     * y.hashCode() != x.hashCode() -> x.equals(y) devera ser false
     */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
