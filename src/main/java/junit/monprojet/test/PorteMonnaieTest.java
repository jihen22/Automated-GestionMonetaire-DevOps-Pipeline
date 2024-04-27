package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;
import org.junit.jupiter.api.Test;

public class PorteMonnaieTest {

    @Test
    public void testAjouteSomme() {
        PorteMonnaie porteMonnaie = new PorteMonnaie();
        porteMonnaie.ajouteSomme(new SommeArgent(5, "EUR"));
        porteMonnaie.ajouteSomme(new SommeArgent(5, "EUR"));

        PorteMonnaie expected = new PorteMonnaie();
        expected.ajouteSomme(new SommeArgent(10, "EUR"));

        assertEquals(expected, porteMonnaie);
    }
}
