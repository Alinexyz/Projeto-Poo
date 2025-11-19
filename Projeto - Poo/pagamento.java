public class pagamento {
    private String nome;
    private String cpf;
    private Float horario;
    private String instituicao;

    public pagamento(String nome, String cpf, Float horario, String instituicao) {
        this.nome = nome;
        this.cpf = cpf;
        this.horario = horario;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Float getHorario() {
        return horario;
    }

    public String getInstituicao() {
        return instituicao;
    }


    public void exibirPagamento() {
        System.out.println("Nome: " + nome + " | CPF: " + cpf + "| Horário:" + horario + "| Banco:" + instituicao);
    }
}