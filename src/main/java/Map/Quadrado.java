package Map;

public class Quadrado implements FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com lados de tamanho: " + lado;
    }
}

