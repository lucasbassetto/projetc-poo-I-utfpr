// Lucas Feliciano Bassetto - RA: 1750658

public class Principal {

    static Carro carro = new Carro();
    static Moto moto = new Moto();
    static Suv suv = new Suv();
    static Leitura l = Leitura.getLeitura();

    static GerenciadorVeiculos gv = GerenciadorVeiculos.getBd();

    public static void main(String[] args) {

        Cliente c = new Cliente();

        System.out.println("\n------------ INSIRA OS DADOS DO CLIENTE ----------");
        c.setNome(l.entDados("DIGITE O NOME DO CLIENTE: "));
        c.setCpf(l.entDados("DIGITE O CPF DO  CLIENTE: "));
        c.setEndereco(l.entDados("DIGITE O ENDEREÇO DO CLIENTE: "));
        c.setTelefone(l.entDados("DIGITE O TELEFONE DO CLIENTE: "));

        //Mostrando no console os dados do cliente digitado
        System.out.println(c);

        boolean flag = true;

        while(flag) {
            System.out.println("\n\t\t===== LOCADORA DE VEÍCULOS =====");
            System.out.println("\n1) INSERIR UM CARRO");
            System.out.println("2) CONSULTAR CARRO PELA PLACA");
            System.out.println("3) ALTERAR A PLACA DO CARRO");
            System.out.println("4) LISTAR TODOS CARROS");
            System.out.println("5) ALUGAR CARRO");
            System.out.println("\n6) INSERIR UMA MOTO");
            System.out.println("7) CONSULTAR MOTO PELA PLACA");
            System.out.println("8) ALTERAR A PLACA DA MOTO");
            System.out.println("9) LISTAR TODAS MOTOS");
            System.out.println("10) ALUGAR MOTO");
            System.out.println("\n11) INSERIR UM SUV");
            System.out.println("12) CONSULTAR SUV PELA PLACA");
            System.out.println("13) ALTERAR A PLACA DO SUV");
            System.out.println("14) LISTAR TODOS SUV'S");
            System.out.println("15) ALUGAR SUV");
            System.out.println("0) SAIR");

            int op = Integer.parseInt(l.entDados("Escolha uma opçao: "));

            switch (op) {
                case 1:
                    carro = new Carro();
                    carro = GerenciadorVeiculos.cadastrarCarro(carro);
                    if(carro != null) {
                        l.entDados("\nCARRO CADASTRADO COM SUCESSO - tecle ENTER para continuar");
                    } else {
                        l.entDados("\nPlaca DUPLICADA - tecle ENTER para continuar");
                    }
                    break;

                case 2:
                    carro = new Carro();
                    carro.setPlaca(l.entDados("Placa a ser CONSULTADA: "));
                    carro = GerenciadorVeiculos.consultarCarro(carro.getPlaca());
                    if(carro != null){
                        GerenciadorVeiculos.imprimirPlacaCadastradaCarro(carro);
                    }
                    else {
                        l.entDados("\nNao existe carro com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 3:
                    carro = new Carro();
                    carro.setPlaca(l.entDados("Placa a ser ALTERADA: "));
                    carro = GerenciadorVeiculos.alterarPlacaCarro(carro.getPlaca());
                    if(carro == null) {
                        l.entDados("\nNao existe carro com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 4:
                    GerenciadorVeiculos.listarCarros();
                    break;

                case 5:
                    carro = new Carro();
                    try {
                        gv.alugarCarro(l.entDados("Digite a placa do carro que você deseja alugar: "));
                    } catch (VeiculoNaoDisponivelException e) {
                        System.out.println("ERRO: " + e.getMessage());
                    }
                    break;

                case 6:
                    moto = new Moto();
                    moto = GerenciadorVeiculos.cadastrarMoto(moto);
                    if(moto != null) {
                        l.entDados("\nMoto cadastrada com sucesso - tecle ENTER para continuar");
                    } else {
                        l.entDados("\nPlaca DUPLICADA - tecle ENTER para continuar");
                    }
                    break;

                case 7:
                    moto = new Moto();
                    moto.setPlaca(l.entDados("Placa a ser CONSULTADA: "));
                    moto = GerenciadorVeiculos.consultarMoto(moto.getPlaca());
                    if(moto != null) {
                        GerenciadorVeiculos.imprimirPlacaCadastradaMoto(moto);
                    }
                    else{
                        l.entDados("\nNao existe moto com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 8:
                    moto = new Moto();
                    moto.setPlaca(l.entDados("Placa a ser Alterada: "));
                    moto = GerenciadorVeiculos.alterarPlacaMoto(moto.getPlaca());
                    if(moto == null) {
                        l.entDados("\nNao existe moto com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 9:
                    GerenciadorVeiculos.listarMotos();
                    break;

                case 10:
                    moto = new Moto();
                    try {
                        gv.alugarMoto(l.entDados("Digite a placa da moto que você deseja alugar: "));
                    } catch (VeiculoNaoDisponivelException e) {
                        System.out.println("ERRO: " + e.getMessage());
                    }
                    break;

                case 11:
                    suv = new Suv();
                    suv = GerenciadorVeiculos.cadastrarSuv(suv);
                    if(suv != null) {
                        l.entDados("\nSUV CADASTRADO COM SUCESSO - tecle ENTER para continuar");
                    } else {
                        l.entDados("\nPlaca DUPLICADA - tecle ENTER para continuar");
                    }
                    break;

                case 12:
                    suv = new Suv();
                    suv.setPlaca(l.entDados("Placa a ser CONSULTADA: "));
                    suv = GerenciadorVeiculos.consultarSuv(suv.getPlaca());
                    if(suv != null){
                        GerenciadorVeiculos.imprimirPlacaCadastradaSuv(suv);
                    }
                    else {
                        l.entDados("\nNao existe suv com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 13:
                    suv = new Suv();
                    suv.setPlaca(l.entDados("Placa a ser ALTERADA: "));
                    suv = GerenciadorVeiculos.alterarPlacaSuv(suv.getPlaca());
                    if(suv == null) {
                        l.entDados("\nNao existe suv com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 14:
                    GerenciadorVeiculos.listarSuvs();
                    break;

                case 15:
                    suv = new Suv();
                    try {
                        gv.alugarSuv(l.entDados("Digite a placa do suv que você deseja alugar: "));
                    } catch (VeiculoNaoDisponivelException e) {
                        System.out.println("ERRO: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.exit(0);

                default:
                    l.entDados("\n Deve escolher entre 0 e 15 - tecle ENTER para continuar");
                    break;
            }
        }
    }
}
