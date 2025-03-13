import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura os dados do usuário
        System.out.println("Digite seu nome completo:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(scanner.nextLine()); 

        System.out.println("Digite o nome da sua mãe:");
        String nomeMae = scanner.nextLine();

        System.out.println("Digite o nome do seu pai:");
        String nomePai = scanner.nextLine();

        // Exibir as informações organizadas
        System.out.println("\n===== CADASTRO COMPLETO =====");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        // Comparação do tamanho dos nomes
        int tamanhoNomeUsuario = nomeUsuario.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();

        System.out.println("\n===== COMPARAÇÃO DE NOMES =====");

        if (tamanhoNomeUsuario > tamanhoNomeMae && tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("Seu nome é o mais longo.");
        } else if (tamanhoNomeMae > tamanhoNomeUsuario && tamanhoNomeMae > tamanhoNomePai) {
            System.out.println("O nome da sua mãe é o mais longo.");
        } else if (tamanhoNomePai > tamanhoNomeUsuario && tamanhoNomePai > tamanhoNomeMae) {
            System.out.println("O nome do seu pai é o mais longo.");
        } else {
            System.out.println("Dois ou mais nomes têm o mesmo tamanho.");
        }

        scanner.close();
    }
}
