package br.edu.infnet.gui;

import javax.swing.*;

public class Teste2 {
    public static void main(String[] args) {
        String fraseOuPalavra = JOptionPane.showInputDialog("Digite uma frase ou palavra com pelo menos 5 caracteres");
        if(fraseOuPalavra != null && !fraseOuPalavra.isEmpty() && fraseOuPalavra.length() >= 5) {
            String retorno = "";
            //Processar a string como se fosse um array
            //jujuba
            //012345
            for (int i = fraseOuPalavra.length()-1; i >= 0; i--) {
                retorno += fraseOuPalavra.charAt(i);
            }
            JOptionPane.showMessageDialog(null, retorno);
        } else if(fraseOuPalavra != null) {
            JOptionPane.showMessageDialog(null, "Entrada Inválida");
        }
    }
}
