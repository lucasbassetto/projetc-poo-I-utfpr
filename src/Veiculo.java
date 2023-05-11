// Lucas Feliciano Bassetto - RA: 1750658

public  abstract class Veiculo {


    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private boolean isDisponivel;

    public Veiculo() {

    }

    public Veiculo(String placa, String marca, String modelo, String cor, boolean isDisponivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.isDisponivel = isDisponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    //Sobrescrita
    @Override
    public String toString() {
        return "\nDados do veiculo inserido:\n" +
                "Nome: " + this.getPlaca() +
                "\nCPF: " + this.getMarca() +
                "\nEndereço: " + this.getModelo() +
                "\nTelefone: " + this.getCor();
    }
}
