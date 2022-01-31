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

    public int getLARG()
    {
        return this.LARG;
    }

    public int getHAUT()
    {
        return this.HAUT;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        //g.clearRect(0,0, LARG, HAUT);
        paintGrille(g);
        repaint();
        revalidate();
    }

    public void paintGrille(Graphics g)
    {
        super.paintComponent(g);

        int nb_case = 10;
        Graphics2D g2d = (Graphics2D) g.create();
        int size = Math.min(getLARG() - 4, getHAUT() - 4) / nb_case;

        int y = ((getHAUT() - (size * nb_case)) / 2);
        for (int horz = 0; horz < nb_case; horz++) {
            int x = ((getLARG() - (size * nb_case)) / 2 ) - 100;
            for (int vert = 0; vert < nb_case; vert++) {
                g.drawRect(x, y, size, size);
                x += size;
            }
            y += size;
        }
        g2d.dispose();
    }
}
