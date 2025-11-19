public class cliente extends pessoa {

    private String endereco;
    private String telefone;

    public cliente (String nome, String cpf, String endereco, String telefone) {
        super(nome, cpf);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        setNome(nome);
    }

    public String getCpf() {
        return super.getCpf();
    }

    public void setCpf(String cpf) {
        setCpf(cpf);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void exibirCliente() {
        System.out.println(
            "Nome: " + getNome() + " | CPF: " + getCpf() + " | Endereço: " + endereco + " | Telefone: " + telefone
        );
    }
}