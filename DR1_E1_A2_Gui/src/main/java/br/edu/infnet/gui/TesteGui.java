package br.edu.infnet.gui;

import javax.swing.*;

public class TesteGui {
    public static void main(String[] args) {
        final int INFO = 1;
        System.out.println("Antes da Mensagem...");
        JOptionPane.showMessageDialog(
                null,
                "Mensagem da Aplicação",
                "Titulo",
                INFO
        );
        System.out.println("Depois da Mensagem...");
    }
    public boolean testaCpf(String cpf) {
    return true;
    }
}

