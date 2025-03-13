import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o cadastro da senha
        System.out.print("Cadastre uma senha: ");
        String senhaCorreta = scanner.nextLine();

        String senhaDigitada;
        
        // Loop para pedir a senha até estar correta
        do {
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }

        } while (!senhaDigitada.equals(senhaCorreta)); 

        System.out.println("Senha correta! Acesso permitido.");

        scanner.close();
    }
}




