
package component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class menu extends javax.swing.JPanel {

    public menu() {
        initComponents();
        setOpaque(false);
    }
  
    @Override
    protected void paintComponent(Graphics grph){
        Graphics2D g2=(Graphics2D) grph;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp=new GradientPaint(0,0,Color.decode("#4568dc"),0,getHeight(),Color.decode("#b06ab3"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0,getWidth(),getHeight(),20, 20);
        g2.fillRect(getWidth() -25,0,getWidth(),getHeight());
        g2.fillRect(0,getHeight()-25,getWidth(),getHeight());
        super.paintComponent(grph);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
