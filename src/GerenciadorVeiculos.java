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
        carro.setPlaca((l.entDados("PLACA: ")));
        carro.setMarca(l.entDados("MARCA: "));
        carro.setModelo(l.entDados("MODELO: "));
        carro.setCor(l.entDados("COR: "));
        carro.setNumeroPortas(l.entDados("NUMERO DE PORTAS: "));
        carro.setDisponivel(true);

        if(consultarCarro(String.valueOf(carro.getPlaca())) == null) {
            carros.add(carro);
            return carro;
        }
            return null;
    }

    public static Carro consultarCarro(String placa) {
        for (Carro carro : carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }

    public static void imprimirPlacaCadastrada(Carro carro){
        System.out.println(
                "Placa já cadastrada: " + carro.getPlaca() + " - " + carro.getMarca() + " - " + carro.getModelo() + " - " + carro.getCor());
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

    public static Carro listarCarros() {
        System.out.println("\" ======= VEÍCULOS DISPONÍVEIS ====== \"");
        for(Carro carro : carros) {
           if(carro.isDisponivel()) {
               System.out.println("\n"
                       + "Placa.....: " + carro.getPlaca() + "\n"
                       + "Marca.....: " + carro.getMarca() + "\n"
                       + "Modelo....: " + carro.getModelo() + "\n"
                       + "Cor.......: " + carro.getCor());
           } else {
               System.out.println("O sistema não possui carros cadastrados!");
           }
        }
        return null;
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
        for (Moto moto : motos) {
            if(moto.getPlaca().equalsIgnoreCase(placa)) {
                return moto;
            }
        }
        return null;
    }

    public static void imprimirPlacaCadastradaMoto(Moto moto){
        System.out.println(
                "Placa já cadastrada: " + moto.getPlaca() + " - " + moto.getMarca() + " - " + moto.getModelo() + " - " + moto.getCor());
    }

    public static Moto alterarPlacaMoto(String placa) {
        for(Moto moto : motos) {
            if(moto.getPlaca().equalsIgnoreCase(placa)) {
                moto.setPlaca(l.entDados("Digite a nova placa: "));
                return moto;
            }
        }
        return null;
    }

    public static Moto listarMotos() {
        System.out.println("\" ======= MOTOS DISPONÍVEIS ====== \"");
        for(Moto moto : motos) {
            if(moto.isDisponivel()) {
                System.out.println("\n"
                        + "Placa.....: " + moto.getPlaca() + "\n"
                        + "Marca.....: " + moto.getMarca() + "\n"
                        + "Modelo....: " + moto.getModelo() + "\n"
                        + "Cor.......: " + moto.getCor());
            } else {
                System.out.println("O sistema não possui motos cadastradas!");
            }
        }
        return null;
    }

    @Override
    public void alugarCarro(String placa) {
        for(Carro carro : carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa) && carro.isDisponivel()) {
                carro.setDisponivel(false);
                System.out.println("Veículo alugado com sucesso!");
            } else  {
                System.out.println("Não foi possível alugar o veículo com a placa informada.");
            }
        }
    }

    @Override
    public void alugarMoto(String placa) {
        for(Carro carro : carros) {
            if(carro.getPlaca().equalsIgnoreCase(placa) && carro.isDisponivel()) {
                carro.setDisponivel(false);
                System.out.println("Veículo alugado com sucesso!");
            } else  {
                System.out.println("Não foi possível alugar o veículo com a placa informada.");
            }
        }
    }

//    @Override
//    public void augarSuv() {
//        for(Suv suv : suvs) {
//            if(suv.getPlaca().equalsIgnoreCase(placa) && suv.isDisponivel()) {
//                suv.setDisponivel(false);
//                System.out.println("Veículo aluado com sucesso!");
//            } else  {
//                System.out.println("Não foi possível alugar o veículo com a placa informada.");
//            }
//        }
//    }

}


