package Banco2;

public class ContaCorrente extends Conta {
    private double juros;
    private double taxaJuros = 0.05;

    public ContaCorrente(Banco banco, Cliente cliente, int codConta, double saldoConta, double juros) {
        super(banco, cliente, codConta, saldoConta);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public ContaCorrente(Banco banco, Cliente cliente, int codConta, double saldoConta) {
        super(banco, cliente, codConta, saldoConta);
    }

    @Override
    public void sacarC(double valor){
        if (this.getSaldoConta() > valor) {
            this.setSaldoConta(getSaldoConta()-valor) ;
            System.out.println(valor +" Sacados de sua conta!");
            System.out.println("Total geral após a transação: " +getSaldoConta());
        } else if (this.getSaldoConta() < valor){
            this.setSaldoConta(getSaldoConta()-valor) ;
            System.out.println(valor+ " Sacados do limite especial!");
            System.out.println("Total geral após a transação: " +getSaldoConta());
        }
    }

    public void saqueJuros(){
        if(this.getSaldoConta()> 0){
        this.setJuros(getSaldoConta()*taxaJuros);
            System.out.println("Juros Acumulado: "+juros);
            setSaldoConta(getSaldoConta()+juros);
            System.out.println("Total com Juros: " +getSaldoConta());
        } else {
            System.out.println("Não há valores para saque.");
        }
    }


}
