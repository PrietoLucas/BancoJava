package Banco2;

public class Conta {
    private Banco banco;
    private Cliente cliente;
    private int codConta;
    private double saldoConta;

    public Conta(Banco banco, Cliente cliente, int codConta, double saldoConta) {
        this.banco = banco;
        this.cliente = cliente;
        this.codConta = codConta;
        this.saldoConta = saldoConta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositarC(double valor){
        if(valor > 0){
            this.saldoConta += valor;
            System.out.println(valor+ " Depositados em sua conta");
            System.out.println("Total da Conta: " +saldoConta);
        } else {
            System.out.println("Valor Invalido!");
        }
    }

    public void sacarC(double valor){
        if (saldoConta >= valor) {
            this.saldoConta -= valor;
            System.out.println(valor +" Sacados de sua conta!");
            System.out.println("Total da Conta: " +saldoConta);
        } else {
            System.out.println("Sem limite para saques!");
        }
    }

    public void saldoP(){
        System.out.println("Saldo atual da Conta "+getSaldoConta());
    }
}
