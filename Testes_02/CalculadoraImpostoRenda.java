import java.util.Scanner;

public class CalculadoraImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário bruto anual
        System.out.print("Digite seu salário bruto anual (R$): ");
        double salarioBruto = Double.parseDouble(scanner.nextLine());

        // Variáveis para cálculo do imposto
        double imposto = 0;

        // Aplicação das faixas do IR
        if (salarioBruto <= 22847.76) {
            imposto = 0; // Isento
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto * 0.075) - 1713.58;
        } else if (salarioBruto <= 45012.60) {
            imposto = (salarioBruto * 0.15) - 4257.57;
        } else if (salarioBruto <= 55976.16) {
            imposto = (salarioBruto * 0.225) - 7633.51;
        } else {
            imposto = (salarioBruto * 0.275) - 10432.32;
        }

        // Calcula o salário líquido após o imposto
        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("\nSalário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Imposto de Renda a Pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}



