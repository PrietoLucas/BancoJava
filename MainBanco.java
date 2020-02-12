package Banco2;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Santander",1);
        Cliente cliente1 = new Cliente("banco1",1,"Lucas","Senna",1111111,1111);
        Conta conta1 = new Conta(banco1,cliente1,1,0);
        ContaCorrente contaC = new ContaCorrente(banco1,cliente1,1,0);


        conta1.saldoP();
        conta1.depositarC(100);
        conta1.sacarC(300);

        contaC.depositarC(100);
        contaC.saqueJuros();
        contaC.sacarC(10);
        contaC.getSaldoConta();
        contaC.depositarCheque(100,"banco1", 101010);
        contaC.depositarCheque(100,"banco1", 101010);
        contaC.depositarCheque(100,"banco1", 101010);
        contaC.getSaldoConta();
        contaC.sacarC(500);

    }
}
