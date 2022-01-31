package flowercraft;

import javax.swing.JFrame;

public class Main {

    public static Main flowercraft;

    public Affichage affichage;

    public Main()
    {
        JFrame jframe = new JFrame("Flowercraft");
        affichage = new Affichage();

        jframe.add(affichage);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(new Affichage());
        jframe.pack();

        jframe.setVisible(true);
    }

    public static void main(String[] args)
    {
        flowercraft = new Main();
    }
}
