package Map;

import java.util.Locale;

public class Circulo implements FiguraGeometrica {
    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser maior que zero.");
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
        return String.format(Locale.forLanguageTag("pt-BR"), "Círculo com raio de tamanho: %.2f", raio);
    }
}
