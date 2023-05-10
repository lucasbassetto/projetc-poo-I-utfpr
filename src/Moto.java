// Lucas Feliciano Bassetto - RA: 1750658

class Moto extends Veiculo {

    private String cilindradas;
    private String categoria;

    public Moto() {
    }

    public Moto(String placa, String marca, String modelo, String cor, boolean isDisponivel, String cilindradas, String categoria) {
        super(placa, marca, modelo, cor, isDisponivel);
        this.cilindradas = cilindradas;
        this.categoria = categoria;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
