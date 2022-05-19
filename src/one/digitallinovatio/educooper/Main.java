package one.digitallinovatio.educooper;

import one.digitallinovatio.educooper.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente edu = new Cliente();
        edu.setNome("Eduardo");

        Conta cc = new ContaCorrente(edu);
        Conta poupanca = new ContaPoupanca(edu);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
