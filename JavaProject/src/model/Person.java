package model;

public class Person {
    private static long countId = 0;
    private final long id;
    private String name;
    private String cpf;
    private String telefone;

    public Person(String name, String cpf, String telefone){
        this.id = countId++;
        this.name = name;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
