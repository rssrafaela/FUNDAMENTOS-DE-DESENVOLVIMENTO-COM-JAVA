package br.edu.infnet.console;

import javax.swing.*;
import java.time.Year;

public class App {
    public static void main(String[] args) {
        //---------------------------------------
        //Entrada
        String sAno = JOptionPane.showInputDialog("Digite um ano para saber se é bissexto: ");
        //---------------------------------------
        //Processamento
        int ano = Integer.parseInt(sAno);// conversão
        String mensagem = "";
        if(Year.isLeap(ano)) {
            mensagem = "O ano " + ano + " é bissexto";
        } else {
            mensagem = "O ano " + ano + " não é bissexto";
        }
        //---------------------------------------
        //Saída
        JOptionPane.showMessageDialog(
                null,
                mensagem,
                "App",
                JOptionPane.INFORMATION_MESSAGE);
    }
}


