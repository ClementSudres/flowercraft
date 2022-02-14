package flowercraft;

public class Fleur {

    public enum TypeFleur {LENT, MOYEN, RAPIDE}
    public TypeFleur type ;
    public int positionFleur;
    public int vitessePousse ;

    public Fleur (TypeFleur type, int idCase) {
        this.type = type ;
        this.positionFleur = idCase;
        //this.vitessePousse;
    }

    //int getVitesse (TypeFleur type) { return type*2 ; }

    TypeFleur getType () {
        return type ;
    }

    //boolean isMature (Fleur fleur) {}

}
