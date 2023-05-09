import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorVeiculos implements Aluguel {

    private static Leitura l = Leitura.getLeitura();
    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Suv> suvs = new ArrayList<>();

    private static GerenciadorVeiculos bd;

    public static GerenciadorVeiculos getBd() {
        if(bd == null) {
            bd = new GerenciadorVeiculos();
            return bd;
        }
            return  bd;
    }

    public static Carro cadastrarCarro(Carro carro) {
        carro.setPlaca((l.entDados("Placa.....: ")));
        carro.setMarca(l.entDados("Marca.....: "));
        carro.setModelo(l.entDados("Modelo.....: "));
        carro.setCor(l.entDados("Cor.....:"));
        carro.setNumeroPortas(l.entDados("Numero de portas.....: "));
        carro.setDisponivel(true);

        if(consultarCarro(String.valueOf(carro.getPlaca())) == null) {
            carros.add(carro);
            return carro;
        }
            return null;
    }

    public static Carro consultarCarro(String placa) {
        for(Carro carro : carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }

    public static void imprimirPlacaCadastrada(Carro carro){
        System.out.println("Placa já cadastrada: ");
        System.out.println("\n"
                + "Placa.....: " + carro.getPlaca() + "\n"
                + "Marca.....: " + carro.getMarca() + "\n"
                + "Modelo....: " + carro.getModelo() + "\n"
                + "Cor.......: " + carro.getCor());
    }

    public static Carro alterarPlacaCarro(String placa) {
        for(Carro carro : carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa)) {
                carro.setPlaca(l.entDados("Digite a nova placa: "));
                System.out.println("Placa atualizada com sucesso!");
                return carro;
            }
        }
        return null;
    }

    public static void listarCarros() {
        boolean carrosDisponiveis = false;
        System.out.println("\" ======= CARROS DISPONIVEIS ====== \"");
        for(Carro carro : carros) {
            if (carro.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + carro.getPlaca() + "\n"
                        + "Marca.....: " + carro.getMarca() + "\n"
                        + "Modelo....: " + carro.getModelo() + "\n"
                        + "Cor.......: " + carro.getCor());
                carrosDisponiveis = true;
            }
        }
        if (!carrosDisponiveis) {
            System.out.println("O sistema não possui carros disponíveis!");
        }
    }

    public static Moto cadastrarMoto(Moto moto) {
        moto.setPlaca((l.entDados("PLACA: ")));
        moto.setMarca(l.entDados("MARCA: "));
        moto.setModelo(l.entDados("MODELO: "));
        moto.setCor(l.entDados("COR: "));
        moto.setCilindradas(l.entDados("CILINDRADAS: "));
        moto.setDisponivel(true);

        if(consultarMoto(String.valueOf(moto.getPlaca())) == null) {
            motos.add(moto);
            return moto;
        }
        return null;
    }

    public static Moto consultarMoto(String placa) {
        for(Moto moto : motos) {
            if(moto.getPlaca().equalsIgnoreCase(placa)) {
                return moto;
            }
        }
        return null;
    }

    public static void imprimirPlacaCadastradaMoto(Moto moto) {
        System.out.println("Placa já cadastrada: ");
        System.out.println("\n"
                + "Placa.....: " + moto.getPlaca() + "\n"
                + "Marca.....: " + moto.getMarca() + "\n"
                + "Modelo....: " + moto.getModelo() + "\n"
                + "Cor.......: " + moto.getCor());
    }

    public static Moto alterarPlacaMoto(String placa) {
        for(Moto moto : motos) {
            if(moto.getPlaca().equalsIgnoreCase(placa)) {
                moto.setPlaca(l.entDados("Digite a nova placa: "));
                System.out.println("Placa atualizada com sucesso!");
                return moto;
            }
        }
        return null;
    }

    public static void listarMotos() {
        boolean motosDisponiveis = false;
        System.out.println("\" ======= MOTOS DISPONIVEIS ====== \"");
        for(Moto moto : motos) {
            if (moto.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + moto.getPlaca() + "\n"
                        + "Marca.....: " + moto.getMarca() + "\n"
                        + "Modelo....: " + moto.getModelo() + "\n"
                        + "Cor.......: " + moto.getCor());
                motosDisponiveis = true;
            }
        }
        if (!motosDisponiveis) {
            System.out.println("O sistema não possui motos disponíveis!");
        }
    }

    @Override
    public void alugarCarro(String placa) throws VeiculoNaoDisponivelException {
        Carro carroEncontrado = null;
        for(Carro carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa) && carro.isDisponivel()) {
                carroEncontrado = carro;
                break;
            }
        }
        if(carroEncontrado == null) {
            throw new VeiculoNaoDisponivelException("Não foi possível alugar o carro pois nao esta disponivel/cadastrados no sistema.");
        } else {
            carroEncontrado.setDisponivel(false);
            System.out.println("Veículo alugado com sucesso!");
            carros.remove(carroEncontrado);
        }
    }

    @Override
    public void alugarMoto(String placa) throws VeiculoNaoDisponivelException {
        Moto motoEncontrada = null;
        for(Moto moto : motos) {
            if (moto.getPlaca().equalsIgnoreCase(placa) && moto.isDisponivel()) {
                motoEncontrada = moto;
                break;
            }
        }
        if(motoEncontrada == null) {
            throw new VeiculoNaoDisponivelException("Não foi possível alugar a moto pois nao esta disponivel/cadastrados no sistema.");
        } else {
            motoEncontrada.setDisponivel(false);
            System.out.println("Veículo alugado com sucesso!");
            motos.remove(motoEncontrada);
        }
    }

    @Override
    public void alugarSuv(String placa) throws VeiculoNaoDisponivelException {
        Suv suvEncontrado = null;
        for(Suv suv : suvs) {
            if (suv.getPlaca().equalsIgnoreCase(placa) && suv.isDisponivel()) {
                suvEncontrado = suv;
                break;
            }
        }
        if(suvEncontrado == null) {
            throw new VeiculoNaoDisponivelException("Não foi possível alugar o SUV pois nao esta disponivel/cadastrados no sistema.");
        } else {
            suvEncontrado.setDisponivel(false);
            System.out.println("Veículo alugado com sucesso!");
            suvs.remove(suvEncontrado);
        }
    }

}


