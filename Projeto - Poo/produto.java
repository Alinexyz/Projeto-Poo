public class produto {
    private String nome;
    private String tipo;
    private String cor;
    private double preco;
    private int quantidade;

    public produto(String nome, String tipo, String cor, double preco, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void reduzirEstoque(int qtd) {
        this.quantidade -= qtd;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome + " | Tipo: " + tipo + "| Cor: " + " | Preço: R$" + preco + " | Estoque: " + quantidade);
    }
}