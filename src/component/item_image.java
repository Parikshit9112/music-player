
package component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.model_popular;

public class item_image extends javax.swing.JPanel {

    public item_image() {
        initComponents();
        init();
    }
    private void init(){
        setOpaque(false);
        setPreferredSize(new Dimension(350,200));
        setMaximumSize(new Dimension(350,200));
        setMinimumSize(new Dimension(350,200));
    }
    
    private model_popular data;
    public void setdata(model_popular data){
        this.data=data;
        lbtitle.setText(data.getTitle());
        lbdes.setText(data.getDescription());
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics grph){
        if(data!=null){
            Graphics2D g=(Graphics2D) grph;
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            Rectangle size=getAutoSize(data.getImage());
            g.drawImage(toImage(data.getImage()), size.x,size.y,size.width,size.height, null);
        }
        super.paintComponent(grph);
    }
        private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }
     private Image toImage(Icon icon){
         return ((ImageIcon) icon).getImage();
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbtitle = new javax.swing.JLabel();
        lbdes = new javax.swing.JLabel();

        lbtitle.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lbtitle.setForeground(new java.awt.Color(252, 248, 248));
        lbtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtitle.setText("Title");

        lbdes.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lbdes.setForeground(new java.awt.Color(255, 255, 255));
        lbdes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbdes.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbdes, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(lbtitle)
                .addGap(61, 61, 61))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(147, Short.MAX_VALUE)
                    .addComponent(lbdes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbdes;
    private javax.swing.JLabel lbtitle;
    // End of variables declaration//GEN-END:variables
}
