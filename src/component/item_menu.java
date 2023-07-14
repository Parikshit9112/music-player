package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.model_menu;

public class item_menu extends javax.swing.JPanel {

        public boolean isSelected() {
        return selected;
    }
    
    private final model_menu data;
    private boolean selected;
    
    public void setSelected(boolean selected){
        this.selected=selected;
        if(selected){
            lbtext.setFont(new java.awt.Font("SansSerif", 0, 14));
            lbtext.setForeground(Color.WHITE);
            lbicon.setIcon(data.toIconSelected());
        }
        else{
            lbtext.setFont(new java.awt.Font("SansSerif", 0, 14));
            lbtext.setForeground(new Color(204,204,204));
            lbicon.setIcon(data.toIcon());
        }
    }

  
    public item_menu(model_menu data) {
        this.data=data;
        initComponents();
        setOpaque(false);
        lbicon.setIcon(data.toIcon());
        lbtext.setText(data.getMenuName());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbicon = new javax.swing.JLabel();
        lbtext = new javax.swing.JLabel();

        lbicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/albums_selected.png"))); // NOI18N

        lbtext.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtext.setForeground(new java.awt.Color(255, 255, 255));
        lbtext.setText("Item Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbicon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lbtext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbicon, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(lbtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    protected void paintComponent(Graphics grph){
        if(selected){
            Graphics2D g2=(Graphics2D) grph;
            g2.setColor(Color.WHITE);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fillRect(0, 0, 2, getHeight());
        }
        super.paintComponent(grph);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbicon;
    private javax.swing.JLabel lbtext;
    // End of variables declaration//GEN-END:variables
}
