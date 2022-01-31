package flowercraft;

public class Batiment {

    public enum TypeBat {PRINCIPAL , PRODUCTION , DEFENSE}
    public TypeBat type ;
    public int abcisseBatiment ;
    public int ordonneeBatiment ;

    public Batiment (TypeBat type, int X , int Y) {
        this.type = type ;
        this.abcisseBatiment = X ;
        this.ordonneeBatiment = Y ;
    }

    int getX () {
        return abcisseBatiment ;
    }

    int getY () {
        return ordonneeBatiment ;
    }

    TypeBat getType () {
        return type ;
    }

}
