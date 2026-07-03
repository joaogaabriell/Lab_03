package Map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    public void testCalcularArea() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(50.0, retangulo.calcularArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals(30.0, retangulo.calcularPerimetro(), 0.0001);
    }

    @Test
    public void testDescricao() {
        Retangulo retangulo = new Retangulo(10, 5);
        assertEquals("Retângulo com altura: 10,00 e largura: 5,00", retangulo.descricao());
    }

    @Test
    public void testInvalidInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-10, 5);
        });
        assertEquals("Altura e largura devem ser maiores que zero.", exception.getMessage());
    }
}
