package Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50, retangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(30, retangulo.calcularPerimetro());
    }

    @Test
    public void testDescricao() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals("Retângulo de altura: 10 e largura: 5", retangulo.descricao());
    }

    @Test
    public void testInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-10, 5);
        });
        assertEquals("Altura e largura devem ser maiores que zero.", exception.getMessage());
    }
}
