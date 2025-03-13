import java.util.Scanner;

public class VerificadorAnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o ano ao usuário
        System.out.print("Digite um ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        // Verificar se é bissexto
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " NÃO é um ano bissexto.");
        }

        scanner.close();
    }
}



