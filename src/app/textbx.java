
package app;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.awt.Graphics;



class textbx extends JTextField {
    private Shape shape;
    public textbx(int size) {
    super(size);
    setOpaque(false);
 }
 protected void paintComponent(Graphics g) {
    g.setColor(getBackground());
    g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 26, 26);
    super.paintComponent(g);
 }
 protected void paintBorder(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    double thickness = 8; // Set your desired thickness here
    Stroke oldStroke = g2.getStroke();
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setStroke(new BasicStroke((float)thickness));
    g.setColor(new Color(11,11,11));//set the color of back
    g.setColor(getForeground());
    g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 35);
    g2.setStroke(oldStroke);
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);


}

 public boolean contains(int x, int y) {
    if (shape == null || !shape.getBounds().equals(getBounds())) {
       shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 26, 26);
    }
    return shape.contains(x, y);
    }
 }









 