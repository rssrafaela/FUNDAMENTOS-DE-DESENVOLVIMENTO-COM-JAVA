package br.edu.infnet.console;

import br.edu.infnet.domain.ContaCorrente;

import java.util.Scanner;

public class Teste1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234,"Machado de Assis", 1234.56);
        String opcao = "";
        while (!opcao.equals("9")) {
            System.out.println("----------------------------");
            System.out.println("Banco Money - Conta-Corrente");
            System.out.println("----------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("9 - sair");
            opcao = input.nextLine();
            switch (opcao) {
                case "1":
                    depositar(cc);
                    System.out.println(cc.obterSaldo());
                    break;
                case "2":
                     break;
                case "9":
                      break;
                default:
                       System.out.println("ERRO: Entrada inválida!");
            }
        }
    }

    private static void depositar(ContaCorrente cc) {
        System.out.print("Digite o valor do depósito: ");
        String svalor = input.nextLine();
        if(!svalor.isEmpty() && svalor.matches("[0-9\\.0-9]*")) {
            double valor = Double.parseDouble(svalor);
            cc.depositar(valor);
        }
    }
}
