public class Circulo {
    // Atributo da classe Circulo
    private double raio;

    // Construtor para inicializar o raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter para acessar o valor do raio
    public double getRaio() {
        return raio;
    }

    // Setter para alterar o valor do raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * (raio * raio); // π * raio²
    }
}


