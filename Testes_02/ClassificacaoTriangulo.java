import java.util.Scanner;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        // Verificar se os lados formam um triângulo válido
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Classificação do triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero (todos os lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles (dois lados iguais).");
            } else {
                System.out.println("O triângulo é Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.println("As medidas informadas NÃO formam um triângulo válido.");
        }

        scanner.close();
    }
}




