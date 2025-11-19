public class transferencia extends pagamento {
    private Double valor;

    public transferencia (String nome, String cpf, Float horario, String instituicao, Double valor) {
        super(nome, cpf, horario, instituicao);
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void exibirTranferencia() {
        System.out.println("Valor: " + valor);
    }
}