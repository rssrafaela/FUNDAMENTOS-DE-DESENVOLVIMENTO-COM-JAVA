import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gerar um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.\n");

        // Loop até o usuário acertar
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            // Verifica se o palpite é maior, menor ou igual ao número secreto
            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR. Tente novamente!\n");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR. Tente novamente!\n");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas!");
            }

        } while (palpite != numeroSecreto); // Continua até o usuário acertar

        scanner.close();
    }
}




