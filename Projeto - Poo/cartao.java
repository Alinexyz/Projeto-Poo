public class cartao extends pagamento {
    private int numCard;
    private Float dtValidade;
    private int codSeg;
    private Float senha;

    public cartao (String nome, String cpf, Float horario, String instituicao, int numCard, Float dtValidade, int codSeg, Float senha) {
        super(nome, cpf, horario, instituicao);
        this.numCard = numCard;
        this.dtValidade = dtValidade;
        this.codSeg = codSeg;
        this.senha = senha;
    }
    public int getNumCard() {
        return numCard;
    }
    public Float getDtValidade() {
        return dtValidade;
    }
    public int getCodSeg() {
        return codSeg;
    }
    public Float getSenha() {
        return senha;
    }

    public void exibirCartao() {
        System.out.println("Número do cartão: " + numCard + " | Data de validade: " + dtValidade + "| Código de segurança:" + codSeg + "| Senha:" + senha);
    }
}