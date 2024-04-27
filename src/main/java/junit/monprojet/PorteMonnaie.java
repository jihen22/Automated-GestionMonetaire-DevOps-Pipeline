package junit.monprojet;

import java.util.HashMap;
import java.util.Objects;

public class PorteMonnaie {
    private HashMap<String, Integer> contenu;

    public PorteMonnaie() {
        contenu = new HashMap<>();
    }

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }

    public void ajouteSomme(SommeArgent sa) {
        String unite = sa.getUnite();
        int quantite = sa.getQuantite();

        contenu.put(unite, contenu.getOrDefault(unite, 0) + quantite);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Contenu du porte-monnaie :\n");
        for (String unite : contenu.keySet()) {
            builder.append(contenu.get(unite)).append(" ").append(unite).append("\n");
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PorteMonnaie other = (PorteMonnaie) obj;
        return Objects.equals(contenu, other.contenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contenu);
    }
}
