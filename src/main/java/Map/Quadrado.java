package Map;

public class Quadrado implements FiguraGeometrica {
    private int lado;

    public Quadrado(int lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
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
    public String descricao() {
        return "Quadrado de lado " + lado;
    }
}
