import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<produto> produtos = new ArrayList<>();
        ArrayList<pessoa> clientes = new ArrayList<>();
        ArrayList<pedido> pedidos = new ArrayList<>();
        ArrayList<cartao> cartoes = new ArrayList<>();
        ArrayList<transferencia> transferencias = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n---- MENU FLORICULTURA ----");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Fazer Pedido");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Listar Clientes");
            System.out.println("6 - Escolher forma de pagamento");
            System.out.println("7 - Exibir forma de pagamento");
            System.out.println("8 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();
                    produtos.add(new produto(nomeP, tipo, cor, preco, qtd));
                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    clientes.add(new cliente(nome, cpf, endereco, telefone));
                    System.out.println("Cliente cadastrado!");
                    break;

                case 3:
                    if (clientes.isEmpty() || produtos.isEmpty()) {
                        System.out.println("É necessário ter clientes e produtos cadastrados!");
                        break;
                    }

                    System.out.println("Escolha o cliente (índice): ");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.print((i + 1) + " - ");
                        clientes.get(i).exibirCliente();
                    }
                    int idxCliente = scanner.nextInt() - 1;
                    pessoa cliente = clientes.get(idxCliente);

                    pedido pedido = new pedido(cliente);

                    String continuar;
                    do {
                        System.out.println("Escolha o produto (índice): ");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            produtos.get(i).exibirProduto();
                        }
                        int idxProduto = scanner.nextInt() - 1;
                        produto prod = produtos.get(idxProduto);

                        System.out.print("Quantidade: ");
                        int qtdProd = scanner.nextInt();

                        pedido.adicionarProduto(prod, qtdProd);

                        System.out.print("Adicionar mais produtos? (s/n): ");
                        scanner.nextLine(); // limpar buffer
                        continuar = scanner.nextLine();

                    } while (continuar.equalsIgnoreCase("s"));

                    pedido.exibirPedido();
                    pedidos.add(pedido);
                    break;

                case 4:
                    for (produto p : produtos) {
                        p.exibirProduto();
                    }
                    break;

                case 5:
                    for ( pessoa c : clientes) {
                        c.exibirCliente();
                    }
                    break;

                case 6:
                System.out.println("Diga a forma de pagamento: ");
                String formaPagamento = scanner.nextLine();
                switch (formaPagamento) {
                case "cartao":
                System.out.print("Nome: ");
                String nomePagCard = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfPagCard = scanner.nextLine();
                System.out.print("Horário do pagamento: ");
                Float horarioCard = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Instituição financeira: ");
                String instituicaoCard = scanner.nextLine();
                System.out.print("Número do cartão: ");
                int numCard = scanner.nextInt();
                System.out.print("Data de validade: ");
                Float dtValidade = scanner.nextFloat();
                System.out.print("Código de segurança: ");
                int codSeg = scanner.nextInt();
                System.out.print("Senha: ");
                Float senha = scanner.nextFloat();
                cartoes.add(new cartao(nomePagCard, cpfPagCard, horarioCard, instituicaoCard, numCard, dtValidade, codSeg, senha));
                System.out.println("Forma de pagamento cadastrada!"); 
                break;

                case "transferencia":
                System.out.print("Nome: ");
                String nomePagTrans = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfPagTrans = scanner.nextLine();
                System.out.print("Horário do pagamento: ");
                Float horarioTrans = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Instituição financeira: ");
                String instituicaoTrans = scanner.nextLine();
                System.out.print("Valor: ");
                Double valor = scanner.nextDouble();
                transferencias.add(new transferencia(nomePagTrans, cpfPagTrans, horarioTrans, instituicaoTrans, valor));
                System.out.println("Forma de pagamento cadastrada!"); 
                break;   
                }
                case 7:
                System.out.println("Qual forma de pagamento deseja exibir: ");
                String formaPag = scanner.nextLine();
                switch (formaPag) {
                case "cartao":
                    for ( cartao c : cartoes) {
                        c.exibirCartao();     
        
                        break;
                    }
                case "tranferencia":
                    for ( transferencia t : transferencias) {
                        t.exibirTranferencia();     
        
                        break;
                    } 
                }
                break;
                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        scanner.close();
    }
}