// Classe Carro
public class Carro {
    // Campos (Atributos)
    String modelo;
    String corExterna;
    String placa;
    int numeroDePortas;
    int anoDeFabricacao;
    String marca;
    String tipoDeCombustivel;
    double quilometragem;
    int velocidadeMaxima;
    double peso;
    String cambio;
    double capacidadeTanque;

    // Método para exibir as informações do meu carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor externa: " + corExterna);
        System.out.println("Placa: " + placa);
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo de combustível: " + tipoDeCombustivel);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Câmbio: " + cambio);
        System.out.println("Capacidade do tanque: " + capacidadeTanque + " litros");
    }
}
