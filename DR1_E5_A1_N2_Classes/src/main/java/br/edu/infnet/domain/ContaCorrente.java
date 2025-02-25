package br.edu.infnet.domain;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;

    // Construtor
    public ContaCorrente(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Métodos
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
        }
    }

    public String obterSaldo() {
        return numero + " - " + titular + " - " + saldo;
    }
}
