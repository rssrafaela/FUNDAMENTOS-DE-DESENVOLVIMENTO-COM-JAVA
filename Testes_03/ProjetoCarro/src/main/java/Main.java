// Classe Main
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto a partir da classe Carro
        Carro meuCarro = new Carro();

        // Definindo os atributos do objeto
        meuCarro.modelo = "Kia Picanto";
        meuCarro.corExterna = "Prata"; // Cor externa do carro
        meuCarro.placa = "BR4SIL25";
        meuCarro.numeroDePortas = 4;
        meuCarro.anoDeFabricacao = 2020;
        meuCarro.marca = "Kia";
        meuCarro.tipoDeCombustivel = "Gasolina";
        meuCarro.quilometragem = 15000.5;
        meuCarro.velocidadeMaxima = 180;
        meuCarro.peso = 850.0; // Peso em kg
        meuCarro.cambio = "Automático";
        meuCarro.capacidadeTanque = 35.0; // Capacidade em litros

        // Chamando o método para exibir informações
        meuCarro.exibirInformacoes();
    }
}
