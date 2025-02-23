package br.edu.infnet.console;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu peso (Kg): ");
        String sPeso = input.nextLine();
        if(!sPeso.isEmpty() && sPeso.matches("[0-9]*")) {
            System.out.print("Digite a sua altura (cm): ");
            String sAltura = input.nextLine();
            if(!sAltura.isEmpty() && sAltura.matches("[0-9]*")) {
                int peso = Integer.parseInt(sPeso);
                int altura = Integer.parseInt(sAltura);
                double imc = peso / (altura * altura);//Math.pow(altura, 2);
                System.out.println("IMC = " + imc);
                if(imc < 18.5) {
                    System.out.println("Magreza");
                } else if(imc >= 18.5 && imc < 25) {
                    System.out.println("Normal");
                } else if(imc >= 25 && imc < 29) {
                    System.out.println("Sobrepeso");
                } else if(imc >= 29 && imc < 40) {
                    System.out.println("Obesidade");
                } else if(imc >= 40) {
                    System.out.println("Normal");
                }
            } else {
                System.out.println("ERRO: entrada inválida");
            }
        } else {
            System.out.println("ERRO: entrada inválida");
        }
    }
}
