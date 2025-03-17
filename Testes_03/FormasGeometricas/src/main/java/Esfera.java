public class Esfera {
    // Atributo da classe Esfera
    private double raio;

    // Construtor para inicializar o raio
    public Esfera(double raio) {
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

    // Método para calcular o volume da esfera
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio); // (4/3) * π * raio³
    }
}
