package Banco2;

public class Cliente {
    private Banco banco;
    private String codCliente;
    private String nome;
    private String sobrenome;
    private int cpf;
    private int rg;

    public Cliente(Banco banco, String codCliente, String nome, String sobrenome, int cpf, int rg) {
        this.banco = banco;
        this.codCliente = codCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Cliente(String banco1, int i, String lucas, String senna, int cpf, int rg) {
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

}
