// Lucas Feliciano Bassetto - RA: 1750658

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
        carro.setPotencia(Integer.parseInt(l.entDados("Potencia (CV).....: ")));
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

    public static void imprimirPlacaCadastradaCarro(Carro carro){
        System.out.println("Placa já cadastrada: ");
        System.out.println("\n"
                + "Placa.....: " + carro.getPlaca() + "\n"
                + "Marca.....: " + carro.getMarca() + "\n"
                + "Modelo....: " + carro.getModelo() + "\n"
                + "Cor.......: " + carro.getCor() + "\n"
                + "Potencia.......: " + carro.getPotencia());
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
        System.out.println("\" ================= CARROS DISPONIVEIS ================= \"");
        for(Carro carro : carros) {
            if (carro.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + carro.getPlaca() + "\n"
                        + "Marca.....: " + carro.getMarca() + "\n"
                        + "Modelo....: " + carro.getModelo() + "\n"
                        + "Cor.......: " + carro.getCor() + "\n"
                        + "Potencia.......: " + carro.getPotencia());
                carrosDisponiveis = true;
            }
        }
        if (!carrosDisponiveis) {
            System.out.println("O sistema nao possui carros disponiveis!");
        }
    }

    public static Moto cadastrarMoto(Moto moto) {
        moto.setPlaca((l.entDados("Placa.....: ")));
        moto.setMarca(l.entDados("Marca.....: "));
        moto.setModelo(l.entDados("Modelo.....: "));
        moto.setCor(l.entDados("Cor.....: "));
        moto.setCilindradas(l.entDados("Cilindradas.....: "));
        moto.setCategoria(l.entDados("Categoria.....: "));
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
                + "Cor.......: " + moto.getCor() + "\n"
                + "Cilindradas.......: " + moto.getCilindradas() + "\n"
                + "Categoria.......: " + moto.getCategoria());
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
        System.out.println("\" ================= MOTOS DISPONIVEIS ================= \"");
        for(Moto moto : motos) {
            if (moto.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + moto.getPlaca() + "\n"
                        + "Marca.....: " + moto.getMarca() + "\n"
                        + "Modelo....: " + moto.getModelo() + "\n"
                        + "Cor.......: " + moto.getCor() + "\n"
                        + "Cilindradas.......: " + moto.getCilindradas() + "\n"
                        + "Categoria.......: " + moto.getCategoria());
                motosDisponiveis = true;
            }
        }
        if (!motosDisponiveis) {
            System.out.println("O sistema nao possui motos disponiveis!");
        }
    }

    public static Suv cadastrarSuv(Suv suv) {
        suv.setPlaca((l.entDados("Placa.....: ")));
        suv.setMarca(l.entDados("Marca.....: "));
        suv.setModelo(l.entDados("Modelo.....: "));
        suv.setCor(l.entDados("Cor.....: "));
        suv.setCapacidadePassageiros(Integer.parseInt(l.entDados("Capacidade de passageiros.....: ")));
        suv.setTemTetoSolar(l.entDados("Possui teto solar? (S/N)"));
        while(!suv.getTemTetoSolar().equalsIgnoreCase("S") && !suv.getTemTetoSolar().equalsIgnoreCase("N")) {
            suv.setTemTetoSolar(l.entDados("Dado inválido, digite S/N"));
        }

        suv.setDisponivel(true);

        if(consultarSuv(String.valueOf(suv.getPlaca())) == null) {
            suvs.add(suv);
            return suv;
        }
        return null;
    }

    public static Suv consultarSuv(String placa) {
        for(Suv suv : suvs) {
            if(suv.getPlaca().equalsIgnoreCase(placa)) {
                return suv;
            }
        }
        return null;
    }

    public static void imprimirPlacaCadastradaSuv(Suv suv) {
        System.out.println("Placa já cadastrada: ");
        System.out.println("\n"
                + "Placa.....: " + suv.getPlaca() + "\n"
                + "Marca.....: " + suv.getMarca() + "\n"
                + "Modelo....: " + suv.getModelo() + "\n"
                + "Cor.......: " + suv.getCor() + "\n"
                + "Capacidade de passageiros.....: " + suv.getCapacidadePassageiros() + "\n"
                + "Possui teto solar.....: " + suv.getTemTetoSolar());
    }

    public static Suv alterarPlacaSuv(String placa) {
        for(Suv suv : suvs) {
            if(suv.getPlaca().equalsIgnoreCase(placa)) {
                suv.setPlaca(l.entDados("Digite a nova placa: "));
                System.out.println("Placa atualizada com sucesso!");
                return suv;
            }
        }
        return null;
    }

    public static void listarSuvs() {
        boolean suvsDisponiveis = false;
        System.out.println("\" ================= SUV'S DISPONIVEIS =================  \"");
        for(Suv suv : suvs) {
            if (suv.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + suv.getPlaca() + "\n"
                        + "Marca.....: " + suv.getMarca() + "\n"
                        + "Modelo....: " + suv.getModelo() + "\n"
                        + "Cor.......: " + suv.getCor() + "\n"
                        + "Capacidade de passageiros.....: " + suv.getCapacidadePassageiros() + "\n"
                        + "Possui teto solar.....: " + suv.getTemTetoSolar());
                suvsDisponiveis = true;
            }
        }
        if (!suvsDisponiveis) {
            System.out.println("O sistema nao possui SUV's disponiveis!");
        }
    }

    //Sobrescrita
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
            throw new VeiculoNaoDisponivelException("Nao foi possivel alugar o carro pois nao esta disponivel/cadastrados no sistema.");
        } else {
            carroEncontrado.setDisponivel(false);
            System.out.println("Veiculo alugado com sucesso!");
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
            throw new VeiculoNaoDisponivelException("Nao foi possivel alugar a moto pois nao esta disponivel/cadastrados no sistema.");
        } else {
            motoEncontrada.setDisponivel(false);
            System.out.println("Veiculo alugado com sucesso!");
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
            throw new VeiculoNaoDisponivelException("Nao foi possivel alugar o SUV pois nao esta disponivel/cadastrados no sistema.");
        } else {
            suvEncontrado.setDisponivel(false);
            System.out.println("Veiculo alugado com sucesso!");
            suvs.remove(suvEncontrado);
        }
    }
}


