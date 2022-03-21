package flowercraft;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;

public class Fleur {

    public enum TypeFleur {LENT , MOYEN , RAPIDE}
    public TypeFleur type ;
    public int positionFleur ;
    public int vitessePousse ;
    public boolean maturiteFleur ;
    public int prix ;
    public int idCase;

    public Fleur(){ //(TypeFleur type, int idCase) {
        //this.type = type ;
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

    public static void pousseFleur(Fleur fleur){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },  4500);
    }
}
