package flowercraft;

public class Fleur {

    public enum TypeFleur {LENT , MOYEN , RAPIDE}
    public TypeFleur type ;
    public int positionFleur ;
    public int vitessePousse ;
    public boolean maturiteFleur ;
    public int prix ;

    public Fleur (TypeFleur type, int idCase) {
        this.type = type ;
        this.positionFleur = idCase ;
        this.maturiteFleur = false ;
        if (this.type == TypeFleur.LENT) {
            this.vitessePousse = 30;
            this.prix = 30 ;
        }
        else if (this.type == TypeFleur.MOYEN) {
            this.vitessePousse = 20;
            this.prix = 20 ;
        }
        else {
            this.vitessePousse = 10 ;
            this.prix = 10 ;
        }
    }

    int getPositionFleur (Fleur fleur) {
        return fleur.positionFleur ;
    }

    TypeFleur getType (Fleur fleur) {
        return fleur.type ;
    }

    void setMaturite (Fleur fleur) {
        fleur.maturiteFleur = true ;
    }

    boolean getMaturite (Fleur fleur) {
        return fleur.maturiteFleur ;
    }

    boolean estMature (Fleur fleur) {
        return fleur.maturiteFleur ;
    }

    int getVitessePousse (Fleur fleur) {
        return fleur.vitessePousse ;
    }

}
