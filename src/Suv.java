// Lucas Feliciano Bassetto - RA: 1750658

public class Suv extends Veiculo {

    private int capacidadePassageiros;
    private String temTetoSolar;

    public Suv() {
    }

    public Suv(String placa, String marca, String modelo, String cor, boolean isDisponivel, int capacidadePassageiros, String temTetoSolar) {
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

    public String getTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(String temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }
}
