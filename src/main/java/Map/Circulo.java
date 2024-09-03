package Map;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser maior que zero.");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String descricao() {
        return String.format("Círculo com raio de tamanho: %.2f", raio);
    }

    // Getter opcional
    public double getRaio() {
        return raio;
    }
}
