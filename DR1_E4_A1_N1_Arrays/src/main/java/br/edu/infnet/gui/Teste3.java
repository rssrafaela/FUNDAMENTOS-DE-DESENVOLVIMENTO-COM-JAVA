package br.edu.infnet.gui;

import javax.swing.*;

public class Teste3 {
    public static void main(String[] args) {
        String [] perguntas = {
                "O técnico foi pontual?",
                "O técnico foi atencioso?",
                "O técnico prestou todos os esclarecimentos?",
                "O técnico deixou o ambiente limpo?"
        };
        String [] respostas = {
                "Concordo", "Concordo Parcialmente", "Discordo"
        };
        int nota = 0;
        String resposta = "";
        for (int i = 0; i < perguntas.length; i++) {
            /*
            int resposta = JOptionPane.showOptionDialog(
                    null,
                    perguntas[i],
                    "Pesquisa de Satisfação",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    respostas,
                    respostas[0]);
             */
            resposta = (String)JOptionPane.showInputDialog(
                    null,
                    perguntas[i],
                    "Pesquisa de Satisfação",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    respostas,
                    "Concordo");
            if(resposta == null) {
                break;
            }
            switch (resposta) {
                //case 0:
                case "Concordo":
                    nota += 10;
                    break;
                //case 1:
                case "Concordo Parcialmente":
                    nota += 5;
            }
        }//for
        if(resposta != null) {
            double percentual = nota * 100 / (perguntas.length * 10);
            JOptionPane.showMessageDialog(null, "O percentual é " + percentual + "%");
        }
    }
}
