package Banco2;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Santander",1);
        Cliente cliente1 = new Cliente("banco1",1,"Lucas","Senna",1111111,1111);
        Conta conta1 = new Conta(banco1,cliente1,1,0);
        ContaCorrente contaC = new ContaCorrente(banco1,cliente1,1,0);


        /// Conta Poupança
        conta1.saldo();
        conta1.depositarC(100);
        conta1.saqueJuros();
        conta1.sacarC(110);
        conta1.saldo();

        /// Conta Corrente
        contaC.saldo();
        contaC.depositarC(300);
        contaC.saldo();
        contaC.depositarCheque(400,"banco1",90);
        contaC.saldo();
        contaC.sacarC(900);
        contaC.saldo();


    }
}
