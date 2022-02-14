package flowercraft;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class FrameBouton extends JFrame implements ActionListener
{

    private JPanel	contentPane;

    public enum TypeForme
    {
        PLEIN
    }

    /**
     * Create the frame.
     */
    public FrameBouton()
    {
        initialize();
    }
    private void initialize() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1000, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 400));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(10, 10, 6, 6));

        Color colors [] = new Color[] {Color.RED, Color.GREEN, Color.BLUE};

        int id = 0;
        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++)
            {

                TypeForme tf = TypeForme.PLEIN;
                float angle = 0.0f;

                Shape shape = createShape(tf, angle);

                BoutonSpecial btn = new BoutonSpecial(id++, shape, colors[((id*x+y)%3)]);
                contentPane.add(btn);
                btn.addActionListener(this);
            }
        }
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.err.println("L'utilisateur a clique le bouton "+((BoutonSpecial)e.getSource()).id);
    }


    /**
     * @param f
     * @param typeforme
     * @return
     */
    private Shape createShape(TypeForme typeforme, float f)
    {
        Shape shape;
        if (typeforme==TypeForme.PLEIN)
            shape = new Rectangle2D.Float(0, 0, 1, 1);
        else
        {
            shape = new Path2D.Double();
            ((Path2D.Double)shape).moveTo(0.0, 0.0);
            ((Path2D.Double)shape).lineTo(1.0, 0.0);
            ((Path2D.Double)shape).lineTo(1.0, 0.0);
            ((Path2D.Double)shape).lineTo(1.0, 1.0);
            ((Path2D.Double)shape).lineTo(0.0, 1.0);
            ((Path2D.Double)shape).closePath();
        }

        AffineTransform at = new AffineTransform();
        at.translate( 0.5,  0.5);
        at.rotate(Math.toRadians(f));
        at.translate(-0.5, -0.5);
        shape = at.createTransformedShape(shape);
        return shape;
    }
}