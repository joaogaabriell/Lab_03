package Map;

public class Circulo implements FiguraGeometrica {
    private int raio;

    public Circulo(int raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
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
    public String descricao() {
        return "Círculo com raio de tamanho: " + raio;
    }
}
