import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as 4 notas
        System.out.println("Digite a primeira nota:");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a segunda nota:");
        double nota2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a terceira nota:");
        double nota3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a quarta nota:");
        double nota4 = Double.parseDouble(scanner.nextLine());

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibir resultado
        System.out.printf("\nSua média foi: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Parabéns! Você foi APROVADO.");
        } else if (media >= 5.0) {
            System.out.println("Você está de RECUPERAÇÃO. Estude mais!");
        } else {
            System.out.println("Infelizmente, você foi REPROVADO.");
        }

        scanner.close();
    }
}
