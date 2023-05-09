// Lucas Feliciano Bassetto - RA: 1750658

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nDados do cliente inserido:\n" +
                "Nome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEndereço: " + this.getEndereco() +
                "\nTelefone: " + this.getTelefone();
    }
}
