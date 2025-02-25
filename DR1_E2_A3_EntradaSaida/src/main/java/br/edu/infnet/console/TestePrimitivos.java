package br.edu.infnet.console;

public class TestePrimitivos {
    public static void main(String[] args) {
        long numeroLongo = 6_000_000_000L + 3 - 90 + 56 * 4; // 6 bilhões
        // vai processar a expresão do lado direito primeiro p depois fazer atribuição.
        float numeroFloat = 14.3F;
        //-----------------------------------------------------
        chat  letra1 = "A";// Tipo primitivo
        String letra2 = "B";// Classe | Objeto
        //-----------------------------------------------------
        //System.out.println("Esse é um teste com \t\tescape\"");
        double n1 = 10.5;
        int n2 = 10;
        float n3 = 3.45F;
        long n4 = 1234;
        String n5 = "999";
        double soma = n1 + n2 + n3 + n4 + Double.parseDouble(n5);// Type Cast
        System.out.println(soma);
    }
}
