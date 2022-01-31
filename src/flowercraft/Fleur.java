package flowercraft;

public class Fleur {

    public enum TypeFleur {1,2,3}
    public TypeFleur type ;
    public int abcisseFleur ;
    public int ordonneeFleur ;
    public int vitessePousse ;

    public Fleur (TypeFleur type, int X, int Y) {
        this.type = type ;
        this.abcisseFleur = X ;
        this.ordonneeFleur = Y ;
        //this.vitessePousse = type*2 ;
    }

    //int getVitesse (TypeFleur type) { return type*2 ; }

    int getX () {
        return abcisseFleur ;
    }

    int getY () {
        return ordonneeFleur ;
    }

    TypeFleur getType () {
        return type ;
    }

    //boolean isMature (Fleur fleur) {}

}
