package Map;

public class Circulo implements FiguraGeometrica {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Círculo com raio de tamanho: " + raio;
    }
}

