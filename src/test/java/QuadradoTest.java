package Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    @Test
    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(49, quadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals(28, quadrado.calcularPerimetro());
    }

    @Test
    public void testDescricao() {
        Quadrado quadrado = new Quadrado(7);
        assertEquals("Quadrado com lado de tamanho: 7", quadrado.descricao());
    }

    @Test
    public void testInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Quadrado(-7);
        });
        assertEquals("O lado deve ser maior que zero.", exception.getMessage());
    }
}
