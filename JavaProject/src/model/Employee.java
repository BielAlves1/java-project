package model;

public class Employee extends Person {
    private static long countId = 0;
    private final long id;
    private String cargo;
    private String setor;

    public Employee(String name, String cpf, String telefone, String cargo, String setor) {
        super(name, cpf, telefone);
        this.id = countId++;
        this.cargo = cargo;
        this.setor = setor;
    }

    public long getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
