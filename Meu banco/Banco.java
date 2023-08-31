import java.util.Scanner;

public class Banco {
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public void Conta(String nomeCliente, int numeroConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: " + saldo);
    }
}

