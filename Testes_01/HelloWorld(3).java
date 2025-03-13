import java.util.Scanner;  // Importação da classe Scanner

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Criação do objeto Scanner
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();  // Lê o nome digitado
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();  // Lê a idade digitada
        System.out.println("Nome: " + nome + " Idade: " + idade);  // Exibe o nome e idade
    }
}
