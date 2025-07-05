package model;

public class Client extends Person {
    private static long countId = 0;
    private final long id;
    private String cidade;
    private String endereco;

    public Client(String name, String cpf, String telefone, String cidade, String endereco) {
        super(name, cpf, telefone);
        this.id = countId++;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
