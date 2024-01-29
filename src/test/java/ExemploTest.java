import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExemploTest {
    public Exemplo implementation;
    @BeforeEach
    public void setUp(){
        this.implementation = new Exemplo();
    }
    @Test
    public void testComparaExtremosTam1() {
        String[] tam1 = new String[]{"a"};
        assertTrue(implementation.comparaExtremos(tam1));
    }
    @Test
    public void testComparaExtremosTamImpar() {
        String[] tamImpar = new String[]{"a", "n", "t", "o", "n", "i", "a"};
        assertTrue(implementation.comparaExtremos(tamImpar));
    }

    @Test
    public void testComparaExtremosTamPar() {
        String[] tamPar = new String[]{"a", "n", "n", "a"};
        assertTrue(implementation.comparaExtremos(tamPar));
    }
    @Test
    void testIndexOf() {

    }
}
