package Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo(25);
        assertEquals(Math.PI * 25 * 25, circulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo circulo = new Circulo(25);
        assertEquals(2 * Math.PI * 25, circulo.calcularPerimetro());
    }

    @Test
    public void testDescricao() {
        Circulo circulo = new Circulo(25);
        assertEquals("Círculo com raio de tamanho: 25,00", circulo.descricao());
    }

    @Test
    public void testInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-25);
        });
        assertEquals("O raio do círculo deve ser maior que zero.", exception.getMessage());
    }
}
