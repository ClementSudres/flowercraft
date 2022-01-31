package flowercraft;


import javax.swing.JPanel;
import java.awt.*;

public class Affichage extends JPanel {

    public static final int LARG = 600;
    public static final int HAUT = 400;

    public Affichage()
    {
        setPreferredSize(new Dimension(LARG, HAUT));
    }
}
