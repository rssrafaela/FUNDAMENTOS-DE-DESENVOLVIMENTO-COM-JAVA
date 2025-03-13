import java.util.Scanner;

public class CalculadoraDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor da compra
        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = Double.parseDouble(scanner.nextLine());

        // Inicializar variáveis de desconto
        double desconto = 0;
        double percentualDesconto = 0;

        // Aplicar regras de desconto
        if (valorCompra > 1000) {
            percentualDesconto = 10; // 10%
        } else if (valorCompra >= 500) {
            percentualDesconto = 5; // 5%
        }

        // Calcular o valor do desconto
        desconto = (valorCompra * percentualDesconto) / 100;
        double valorFinal = valorCompra - desconto;

        System.out.printf("\nValor original: R$ %.2f\n", valorCompra);
        System.out.printf("Desconto aplicado: %.0f%% (R$ %.2f)\n", percentualDesconto, desconto);
        System.out.printf("Valor final com desconto: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}


