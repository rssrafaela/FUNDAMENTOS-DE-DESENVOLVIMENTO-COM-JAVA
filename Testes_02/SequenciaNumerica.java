import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os valores ao usuário
        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int incremento = scanner.nextInt();

        // Verifica se o incremento é válido
        if (incremento <= 0) {
            System.out.println("O incremento deve ser maior que zero!");
        } else {
            // Gerar a sequência numérica
            System.out.print("Sequência gerada: ");
            int valorAtual = valorInicial;

            while (valorAtual <= 100) {
                System.out.print(valorAtual);
                valorAtual += incremento;
                
                if (valorAtual <= 100) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}




