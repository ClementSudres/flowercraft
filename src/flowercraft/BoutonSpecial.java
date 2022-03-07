package flowercraft;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import javax.swing.JComponent;

public class BoutonSpecial extends JComponent implements ComponentListener, MouseListener, MouseMotionListener
{
    Shape shape;
    Shape shape_scaled;
    Color color;
    private boolean	mouseInside;
    public int id;

    public BoutonSpecial(int id, Shape shape, Color color)
    {
        this.id = id;
        this.color = Color.white;
        this.shape = shape;
        recalculFormeScaled();
        addComponentListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    /**
     *
     */
    private void recalculFormeScaled()
    {
        AffineTransform at = new AffineTransform();
        at.scale(getWidth()-1, getHeight()-1);
        shape_scaled = at.createTransformedShape(shape);
    }

    @Override
    public void paint(Graphics g1){
        Graphics2D g = (Graphics2D) g1;

        if (mouseInside==false)
            g.setColor(color);
        else
            g.setColor(color.darker());

        g.fill(shape_scaled);
        g.setColor(Color.BLACK);
        g.draw(shape_scaled);
    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentResized(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentResized(ComponentEvent e)
    {
        recalculFormeScaled();
    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentMoved(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentMoved(ComponentEvent e)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentShown(ComponentEvent e)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see java.awt.event.ComponentListener#componentHidden(java.awt.event.ComponentEvent)
     */
    @Override
    public void componentHidden(ComponentEvent e)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseClicked(MouseEvent e)
    {
        if (mouseInside==true)
            fire();
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
     */
    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseReleased(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseExited(MouseEvent e)
    {
        mouseInside = false;
        repaint();
    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseDragged(MouseEvent e)
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
     */
    @Override
    public void mouseMoved(MouseEvent e)
    {
        if (shape_scaled.contains(e.getPoint()))
            mouseInside = true;
        else
            mouseInside = false;
        repaint();
    }

    /**
     * @param //frameBoutonstest
     */
    public void addActionListener(ActionListener listener)
    {
        listenerList.add(ActionListener.class, listener);
    }

    private void fire()
    {
        Object[] listeners = getListeners(ActionListener.class);
        // loop through each listener and pass on the event if needed
        int numListeners = listeners.length;
        for (int i = 0; i < numListeners; i ++)
        {
            // pass the event to the listeners event dispatch method
            ((ActionListener)listeners[i]).actionPerformed(new ActionEvent(this, 0, "Dudul"));
        }
    }


}
