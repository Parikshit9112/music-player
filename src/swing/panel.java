package swing;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class panel extends JPanel {
   
    public panel(){
        setOpaque(false);
    }
    @Override
    protected void paintComponent(Graphics grph){
        Graphics2D g2=(Graphics2D) grph;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0,getWidth(),getHeight(),20, 20);
        g2.fillRect(0,getHeight()-25,getWidth(),getHeight());
        super.paintComponent(grph);
        
    }
           
}
