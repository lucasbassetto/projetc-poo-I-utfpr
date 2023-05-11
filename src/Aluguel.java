// Lucas Feliciano Bassetto - RA: 1750658

public interface Aluguel {

    void alugarCarro(String placa) throws VeiculoNaoDisponivelException;

    void alugarMoto(String placa)  throws VeiculoNaoDisponivelException;

    void alugarSuv(String placa)  throws VeiculoNaoDisponivelException;

}
