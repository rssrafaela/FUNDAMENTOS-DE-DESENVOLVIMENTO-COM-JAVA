public class Conta {
    // Atributos da conta bancária
    private String titular;         // Nome do titular da conta
    private int numero;             // Número da conta
    private String agencia;         // Agência bancária
    private double saldo;           // Saldo disponível na conta
    private String dataAbertura;    // Data de abertura da conta

    // Método para realizar um saque
    public void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    // Método para realizar um depósito
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para calcular o rendimento da conta (10% do saldo)
    public double calculaRendimento() {
        return saldo * 0.1;  // Retorna 10% do saldo atual
    }

    // Métodos getters para acessar os atributos
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    // Método para exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }

    // Construtor para inicializar os atributos
    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }
}


