package br.edu.infnet.console;

import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de números da aposta (de 6 a 15): ");
        String sQtdNumeros = input.nextLine();
        if(!sQtdNumeros.isEmpty() && sQtdNumeros.matches("[0-9]*")) {
            int qtdNumeros = Integer.parseInt(sQtdNumeros);
            if(qtdNumeros >= 6 && qtdNumeros <= 15) {
                String resultado = "";
                while (qtdNumeros > 0) {
                    int numero = 0;
                    boolean temRepetido = true;
                    //while (temRepetido) {
                    do {
                        numero = (int) (Math.random() * 60) + 1;//sorteando um número
                        if(!resultado.contains(String.valueOf(numero))) {
                            temRepetido = false;
                        }
                    } while (temRepetido);
                    resultado += numero + " ";
                    qtdNumeros--;
                }
                System.out.println("Seu Jogo: " + resultado);
            } else {
                System.out.println("ERRO: Entrada inválida");
            }
        } else {
            System.out.println("ERRO: Entrada inválida");
        }
    }
}
