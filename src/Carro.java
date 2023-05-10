// Lucas Feliciano Bassetto - RA: 1750658

public class Carro extends Veiculo {

    private String numeroPortas;
    private int potencia;

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, String cor, boolean isDisponivel, String numeroPortas, int potencia) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.numeroPortas = numeroPortas;
        this.potencia = potencia;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
