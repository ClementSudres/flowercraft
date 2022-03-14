package flowercraft;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static Main flowercraft;

    Affichage affichage = new Affichage();

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
        flowercraft = new Main();
    }
}