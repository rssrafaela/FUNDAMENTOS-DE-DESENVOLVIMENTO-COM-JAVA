package br.edu.infnet.console;

import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + nome);
        }
    }
}
