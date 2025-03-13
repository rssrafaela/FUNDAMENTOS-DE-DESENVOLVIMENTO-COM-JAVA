import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraIdadeDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar data de nascimento
        System.out.print("Digite o dia do seu nascimento: ");
        int dia = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o mês do seu nascimento (1-12): ");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = Integer.parseInt(scanner.nextLine());

        // Data de nascimento do usuário
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Cálculo da diferença em dias
        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("\nVocê viveu aproximadamente " + idadeEmDias + " dias.");

        scanner.close();
    }
}


