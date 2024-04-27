package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.monprojet.UniteDistincteException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.monprojet.SommeArgent;

public class SommeArgentTest {
    private SommeArgent m12CHF;
    private SommeArgent m14CHF;
    private SommeArgent m14USD;

    @BeforeEach
    public void setUp() {
        m12CHF = new SommeArgent(12, "CHF");
        m14CHF = new SommeArgent(14, "CHF");
        m14USD = new SommeArgent(14, "USD");
        System.out.println("Avant exécution d'une méthode de test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("apres exécution d'une méthode de test");
    }


    @Test
    public void testAdditionSommesArgent() throws UniteDistincteException {
        // Création des sommes d'argent
        SommeArgent somme1 = new SommeArgent(100, "CHF");
        SommeArgent somme2 = new SommeArgent(50, "USD");

        // Addition des sommes
        SommeArgent sommeResultat = somme1.add(somme2);


    }
    @Test
    public void testAdditionUnitesDistinctes() {
        SommeArgent m12CHF = new SommeArgent(12, "USD");
        SommeArgent m14USD = new SommeArgent(14, "USD");

        Assertions.assertThrows(UniteDistincteException.class, () -> {
            m12CHF.add(m14USD);
        });
    }
}
