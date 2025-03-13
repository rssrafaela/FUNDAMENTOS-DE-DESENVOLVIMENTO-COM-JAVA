import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        // Verifica se a frase está vazia
        if (frase.isEmpty()) {
            System.out.println("A frase está vazia! Nenhuma palavra encontrada.");
        } else {
            // Divide a frase em palavras usando espaço como separador
            String[] palavras = frase.split("\\s+");

            System.out.println("A frase contém " + palavras.length + " palavra(s).");
        }

        scanner.close();
    }
}





