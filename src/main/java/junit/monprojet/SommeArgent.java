package junit.monprojet;

public class SommeArgent {
    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!unite.equals(m.unite)) {
            throw new UniteDistincteException("Les unités sont différentes");
        }
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SommeArgent that = (SommeArgent) obj;
        return quantite == that.quantite && unite.equals(that.unite);
    }
}
