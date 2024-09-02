package Map;

public class Retangulo implements FiguraGeometrica {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public String toString() {
        return "Retângulo com altura: " + altura + " e largura: " + largura;
    }
}
