// Lucas Feliciano Bassetto - RA: 1750658

class Moto extends Veiculo {

    private String cilindradas;

    public Moto() {
    }

    public Moto(String placa, String marca, String modelo, String cor, boolean isDisponivel, String cilindradas) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
}
