import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição das taxas de câmbio
        final double TAXA_DOLAR = 5.00; 
        final double TAXA_EURO = 5.45;  
        final double TAXA_LIBRA = 6.30; 

        // Entrada do valor em reais
        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = Double.parseDouble(scanner.nextLine());

        // Escolha da moeda de destino
        System.out.print("Escolha a moeda de destino (dólar, euro, libra): ");
        String moeda = scanner.nextLine().toLowerCase(); // Converte para minúsculas

        // Conversão do valor
        double valorConvertido = 0;
        String simboloMoeda = "";

        switch (moeda) {
            case "dólar":
            case "dolar":
                valorConvertido = valorReais / TAXA_DOLAR;
                simboloMoeda = "USD";
                break;
            case "euro":
                valorConvertido = valorReais / TAXA_EURO;
                simboloMoeda = "EUR";
                break;
            case "libra":
                valorConvertido = valorReais / TAXA_LIBRA;
                simboloMoeda = "GBP";
                break;
            default:
                System.out.println("Moeda inválida! Escolha entre: dólar, euro ou libra.");
                scanner.close();
                return; 
        }

        System.out.printf("O valor de R$ %.2f equivale a %.2f %s\n", valorReais, valorConvertido, simboloMoeda);

        scanner.close();
    }
}

