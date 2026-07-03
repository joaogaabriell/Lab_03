package Map;

import java.util.Locale;

public class Quadrado implements FiguraGeometrica {
    private final double lado;

    public Quadrado(double lado) {
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
        return String.format(Locale.forLanguageTag("pt-BR"), "Quadrado com lado: %.2f", lado);
    }
}
