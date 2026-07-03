package Map;

import java.util.Locale;

public class Retangulo implements FiguraGeometrica {
    private final double altura;
    private final double largura;

    public Retangulo(double altura, double largura) {
        if (altura <= 0 || largura <= 0) {
            throw new IllegalArgumentException("Altura e largura devem ser maiores que zero.");
        }
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
    public String descricao() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Retângulo com altura: %.2f e largura: %.2f", altura, largura);
    }
}
