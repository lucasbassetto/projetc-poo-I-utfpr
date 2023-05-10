// Lucas Feliciano Bassetto - RA: 1750658

public class Suv extends Veiculo {

    private int capacidadePassageiros;
    private boolean temTetoSolar;

    public Suv() {
    }

    public Suv(String placa, String marca, String modelo, String cor, boolean isDisponivel, int capacidadePassageiros, boolean temTetoSolar) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.capacidadePassageiros = capacidadePassageiros;
        this.temTetoSolar = temTetoSolar;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public boolean isTemTetoSolar(boolean temTetoSolar) {
        return this.temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }
}
