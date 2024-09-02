
package Map;

public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {
        // Criando as figuras
        Retangulo retangulo = new Retangulo(10, 5);
        Quadrado quadrado = new Quadrado(7);
        Map.Circulo circulo = new Circulo(25);

        // Calculando e exibindo as áreas
        System.out.println(retangulo.toString() + " tem área de: " + retangulo.calcularArea());
        System.out.println(quadrado.toString() + " tem área de: " + quadrado.calcularArea());
        System.out.println(circulo.toString() + " tem área de: " + circulo.calcularArea());

        // Calculando e exibindo os perímetros
        System.out.println(retangulo.toString() + " tem perímetro de: " + retangulo.calcularPerimetro());
        System.out.println(quadrado.toString() + " tem perímetro de: " + quadrado.calcularPerimetro());
        System.out.println(circulo.toString() + " tem perímetro de: " + circulo.calcularPerimetro());
    }
}

