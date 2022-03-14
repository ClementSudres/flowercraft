package flowercraft;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class Affichage implements ActionListener{

    public int g_WIDTH = 500;
    public int g_HEIGHT = 0;

    public void Affichage()
    {

        //Création de la fenêtre
        JFrame frame = new JFrame("Flowercraft");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 600);
        frame.setPreferredSize(new Dimension(1000, 600));

        //Création de la grille avec les bouttons
        JPanel grilleBouton = new JPanel();
        grilleBouton.setBorder(new EmptyBorder(5, 5, 5, 5));
        grilleBouton.setLayout(new GridLayout(10, 10, 6, 6));
        grilleBouton.setSize(g_WIDTH, g_HEIGHT);
        grilleBouton.setPreferredSize(new Dimension(g_WIDTH, g_HEIGHT));
        Color colors [] = new Color[] {Color.RED, Color.GREEN, Color.BLUE};
        int id = 0;
        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++)
            {
                float angle = 0.0f;
                Shape shape = createShape(angle);
                BoutonSpecial btn = new BoutonSpecial(id++, shape, colors[((id*x+y)%3)]);
                grilleBouton.add(btn);
                btn.addActionListener(this);
            }
        }

        //Création d'un rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setPreferredSize(new Dimension(400,200));

        //Création d'un container (il contient tout les panels)
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        container.setSize(1000, 600);
        container.setPreferredSize(new Dimension(1000, 600));

        //Ajout des panels dans le panel container
        container.add(grilleBouton);
        container.add(rectangle);

        //Ajout du container a là frame
        frame.add(container);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.err.println("L'utilisateur a clique le bouton "+((BoutonSpecial)e.getSource()).id);
    }

    private Shape createShape(float f)
    {
        Shape shape;
        shape = new Rectangle2D.Float(0, 0, 1, 1);

        AffineTransform at = new AffineTransform();
        at.translate( 0.5,  0.5);
        at.rotate(Math.toRadians(f));
        at.translate(-0.5, -0.5);
        shape = at.createTransformedShape(shape);
        return shape;
    }

    class Rectangle extends JPanel {
        public void paint(Graphics g) {
            super.paintComponents(g);
            g.setColor(Color.BLACK);
            g.drawRect(4, 9,435,200);
        }
    }
}