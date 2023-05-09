public class Principal {

    static Carro carro = new Carro();
    static Moto moto = new Moto();
    static Leitura l = Leitura.getLeitura();

    static GerenciadorVeiculos gv = GerenciadorVeiculos.getBd();

    public static void main(String[] args) {

//        Cliente c = new Cliente();
//
//        System.out.println("\n------------ INSIRA OS DADOS DO CLIENTE ----------");
//        c.setNome(l.entDados("DIGITE O NOME DO CLIENTE: "));
//        c.setCpf(l.entDados("DIGITE O CPF DO  CLIENTE: "));
//        c.setEndereco(l.entDados("DIGITE O ENDEREÇO DO CLIENTE: "));
//        c.setTelefone(l.entDados("DIGITE O TELEFONE DO CLIENTE: "));
//
//        //Mostrando no console os dados do cliente digitado
//        System.out.println(c);

        boolean flag = true;

        while(flag) {
            System.out.println("\n\t\t===== LOCADORA DE VEÍCULOS =====");
            System.out.println("\n1) INSERIR UM CARRO");
            System.out.println("2) CONSULTAR CARRO PELA PLACA");
            System.out.println("3) ALTERAR A PLACA DO CARRO");
            System.out.println("4) LISTAR TODOS CARROS");
            System.out.println("5) ALUGAR CARROS");
            System.out.println("\n6) INSERIR UMA MOTO");
            System.out.println("7) CONSULTAR MOTO PELA PLACA");
            System.out.println("8) ALTERAR A PLACA DA MOTO");
            System.out.println("9) LISTAR TODAS MOTOS");
            System.out.println("8) ALUGAR MOTOS");
//            System.out.println("\n9) INSERIR UM SUV");
//            System.out.println("10) CONSULTAR SUV PELA PLACA");
//            System.out.println("11) ALTERAR A PLACA DO SUV");
//            System.out.println("12) LISTAR TODOS SUV'S");
            System.out.println("0) SAIR");

            int op = Integer.parseInt(l.entDados("Escolha uma opção: "));

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
                        GerenciadorVeiculos.imprimirPlacaCadastrada(carro);
                    }
                    else {
                        l.entDados("\nNão existe carro com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 3:
                    carro = new Carro();
                    carro.setPlaca(l.entDados("Placa a ser ALTERADA: "));
                    carro = GerenciadorVeiculos.alterarPlacaCarro(carro.getPlaca());
                    if(carro == null) {
                        l.entDados("\nNão existe carro com essa placa cadastrada - tecle ENTER para continuar");
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
                        l.entDados("\nNão existe moto com essa placa cadastrada - tecle ENTER para continuar");
                    }
                    break;

                case 8:
                    moto = new Moto();
                    moto.setPlaca(l.entDados("Placa a ser Alterada: "));
                    moto = GerenciadorVeiculos.alterarPlacaMoto(moto.getPlaca());
                    if(moto == null) {
                        l.entDados("\nNão existe moto com essa placa cadastrada - tecle ENTER para continuar");
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
            }
        }
    }
}
