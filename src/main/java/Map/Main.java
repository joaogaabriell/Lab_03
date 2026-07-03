package Map;

public class Main {
    public static void main(String[] args) {
        try {
            FiguraGeometrica retangulo = new Retangulo(10, 5);
            FiguraGeometrica quadrado = new Quadrado(7);
            FiguraGeometrica circulo = new Circulo(10);

            System.out.println(retangulo.descricao());
            System.out.println("Área: " + retangulo.calcularArea());
            System.out.println("Perímetro: " + retangulo.calcularPerimetro());

            System.out.println(quadrado.descricao());
            System.out.println("Área: " + quadrado.calcularArea());
            System.out.println("Perímetro: " + quadrado.calcularPerimetro());

            System.out.println(circulo.descricao());
            System.out.println("Área: " + circulo.calcularArea());
            System.out.println("Perímetro: " + circulo.calcularPerimetro());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
