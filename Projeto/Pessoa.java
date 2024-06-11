public class Pessoa {
    private String nomePessoa;
    private String nascimento;
    private String cep;
    private String telefone;

    public Pessoa(String nomePessoa, String nascimento, String cep, String telefone) {
        this.nomePessoa = nomePessoa;
        this.nascimento = nascimento;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCEP() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }
}