public class TesteConta {
    public static void main(String[] args) {
        // Criando um objeto da classe Conta
        Conta conta = new Conta("Rafaela Souza", 123456, "Agência 001", 1000.00, "15/03/2025");

        // Exibindo as informações iniciais da conta
        System.out.println("Informações iniciais da conta:");
        conta.exibirInformacoes();
        System.out.println();

        // Realizando um depósito
        System.out.println("Realizando um depósito de R$ 500...");
        conta.deposita(500);
        System.out.println("Saldo após o depósito: R$ " + conta.getSaldo());
        System.out.println();

        // Realizando um saque
        System.out.println("Realizando um saque de R$ 300...");
        conta.saca(300);
        System.out.println("Saldo após o saque: R$ " + conta.getSaldo());
        System.out.println();

        // Calculando o rendimento
        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento (10% do saldo): R$ " + rendimento);
        System.out.println();

        // Exibindo as informações finais da conta
        System.out.println("Informações finais da conta:");
        conta.exibirInformacoes();
    }
}
