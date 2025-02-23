package br.edu.infnet.console;

public class Teste1 {
    public static void main(String[] args) {
        //for(int i = 1; i <= 10; i++) {
        int i = 1;
        for(;;) {
            if(i == 10) {
                break;
            }
            System.out.println("Tabuada do " + i);
            for(int j = 2; j <= 9; j++) {
                int conta = i * j;
                System.out.println(i + " * " + j + " = " + conta);
            }
            i++;
        }
    }
}
