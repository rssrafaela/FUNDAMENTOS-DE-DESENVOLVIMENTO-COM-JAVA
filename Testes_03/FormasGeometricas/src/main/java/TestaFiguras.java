public class TestaFiguras {
    public static void main(String[] args) {
        // Criando um objeto da classe Circulo com raio 3.0
        Circulo circulo = new Circulo(3.0);

        // Chamando o método calcularArea para calcular a área do círculo
        double area = circulo.calcularArea();
        System.out.println("Área do Círculo com raio 3.0: " + area);

        // Criando um objeto da classe Esfera com raio 5.0
        Esfera esfera = new Esfera(5.0);

        // Chamando o método calcularVolume para calcular o volume da esfera
        double volume = esfera.calcularVolume();
        System.out.println("Volume da Esfera com raio 5.0: " + volume);
    }
}

