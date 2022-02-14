package flowercraft;

import javax.swing.JFrame;
import java.awt.*;

public class Main {

    public static Main flowercraft;

    public Affichage affichage;

    public Main()
    {
        JFrame jframe = new JFrame("Flowercraft");
        /*
        affichage = new Affichage();
        jframe.add(affichage);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(new Affichage());
        jframe.pack();
        jframe.setVisible(true);
         */
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    FrameBouton frame = new FrameBouton();
                    frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args)
    {
        flowercraft = new Main();
    }
}