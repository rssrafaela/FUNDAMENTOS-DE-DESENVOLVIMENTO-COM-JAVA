package br.edu.infnet.gui;

import javax.swing.*;

public class Teste1 {
    public static void main(String[] args) {
        String fraseOuPalavra = JOptionPane.showInputDialog("Digite uma frase ou palavra com pelo menos 5 caracteres");
        if(fraseOuPalavra != null && !fraseOuPalavra.isEmpty() && fraseOuPalavra.length() >= 5) {
            String retorno = "";
            //Processar a string como se fosse um array
            for (int i = 0; i < fraseOuPalavra.length(); i++) {
                retorno += fraseOuPalavra.charAt(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, retorno);
        } else if(fraseOuPalavra != null) {
            JOptionPane.showMessageDialog(null, "Entrada Inválida");
        }
    }
}
