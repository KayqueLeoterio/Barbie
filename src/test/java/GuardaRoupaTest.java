
import org.example.GuardaRoupa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuardaRoupaTest {

    private GuardaRoupa guardaRoupa;

    @BeforeEach
    void setUp() {
        guardaRoupa = new GuardaRoupa(500.00);
    }

    // Testes do precoComDesconto

    @Test
    void deveAplicarDescontoCorretamente() {
        double resultado = guardaRoupa.precoComDesconto(200, 10);

        assertEquals(180, resultado, 0.001);
    }

    @Test
    void deveAceitarPrecoAbaixoDoOrcamento() {
        assertTrue(guardaRoupa.cabeNoOrcamento(400));
    }

    @Test
    void deveAceitarPrecoExatamenteIgualAoOrcamento() {
        assertTrue(guardaRoupa.cabeNoOrcamento(500));
    }

    // Testes do ehDeGala

    @Test
    void naoDeveSerGalaAbaixoDe200() {
        assertFalse(guardaRoupa.ehDeGala(199));
    }

    @Test
    void naoDeveSerGalaExatamenteEm200() {
        assertFalse(guardaRoupa.ehDeGala(200));
    }

    @Test
    void deveSerGalaAcimaDe200() {
        assertTrue(guardaRoupa.ehDeGala(201));
    }
}
