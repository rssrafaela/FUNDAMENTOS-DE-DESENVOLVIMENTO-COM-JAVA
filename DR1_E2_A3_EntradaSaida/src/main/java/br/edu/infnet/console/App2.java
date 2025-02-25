package br.edu.infnet.console;

import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------
        //Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um ano para saber se é bissexto: ");
        int ano = entrada.nextInt();
        //--------------------------------------------------------------------------
        //Processamento
        String mensagem = "";
        if(Year.isLeap(ano)) {
            mensagem = "O ano " + ano + " é bissexto";
        } else {
            mensagem = "O ano " + ano + " não é bissexto";
        }
        //--------------------------------------------------------------------------
        //Saída
        System.out.println(mensagem);
    }
}
