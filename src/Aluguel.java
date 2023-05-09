import java.time.LocalDate;

public interface Aluguel {

    void alugarCarro(String placa) throws VeiculoNaoDisponivelException;

    void alugarMoto(String placa)  throws VeiculoNaoDisponivelException;

    void alugarSuv(String placa)  throws VeiculoNaoDisponivelException;

}
