// Lucas Feliciano Bassetto - RA: 1750658

public class Carro extends Veiculo {

    private String numeroPortas;

    public Carro() {
    }

    public Carro(String placa, String marca, String modelo, String cor, boolean isDisponivel, String numeroPortas) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.numeroPortas = numeroPortas;
    }

    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
