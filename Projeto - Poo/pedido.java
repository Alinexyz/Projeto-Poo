import java.util.ArrayList;

public class pedido {
    private pessoa cliente;
    private ArrayList<produto> produtos = new ArrayList<>();
    private ArrayList<Integer> quantidades = new ArrayList<>();

    public pedido(pessoa cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(produto produto, int qtd) {
        if (produto.getQuantidade() >= qtd) {
            produtos.add(produto);
            quantidades.add(qtd);
            produto.reduzirEstoque(qtd);
        } else {
            System.out.println("Estoque insuficiente para: " + produto.getNome());
        }
    }

    public void exibirPedido() {
        System.out.println("Pedido do cliente: " + cliente.getNome());
        double total = 0;
        for (int i = 0; i < produtos.size(); i++) {
            produto p = produtos.get(i);
            int qtd = quantidades.get(i);
            double subtotal = p.getPreco() * qtd;
            System.out.println("- " + p.getNome() + " x" + qtd + " = R$" + subtotal);
            total += subtotal;
        }
        System.out.println("Total: R$" + total);
    }
}