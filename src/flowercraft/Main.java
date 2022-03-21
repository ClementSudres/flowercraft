package flowercraft;

import javax.swing.*;
import java.awt.*;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static Main flowercraft;

    Affichage affichage = new Affichage();

    static Fleur fleur = new Fleur();

    public Main()
    {
        /*
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    affichage.Affichage();
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
         */
        this.affichage.Affichage();
    }

    public static void main(String[] args)
    {
        //fleur.pousseFleur(fleur);
        flowercraft = new Main();
    }
}