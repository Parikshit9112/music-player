package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.model_music;
import javax.swing.ImageIcon;

public class item_music extends javax.swing.JPanel {

    public boolean isPlay() {
        return play;
    }
    
    private final model_music data;
    private boolean play;
    
    public void setplay(boolean play){
        this.play=play;
        if(play){
            lbicon.setText("");
            lbicon.setIcon(new ImageIcon(getClass().getResource("/icon/playing.png")));
            lbtext.setFont(new java.awt.Font("SansSerif", 1, 14));
            lbtext.setForeground(new Color(203,30,148));
            lbtime.setFont(new java.awt.Font("SansSerif", 1, 14));
            lbtime.setForeground(new Color(203,30,148));
  
        }
        else{
            lbicon.setIcon(null);
            lbicon.setText(data.getNo());
            lbtext.setFont(new java.awt.Font("SansSerif", 0, 15));
            lbtext.setForeground(new Color(51, 51, 51));
            lbtime.setFont(new java.awt.Font("SansSerif", 0, 15));
            lbtime.setForeground(new Color(51, 51, 51));
        }
    }

  
    public item_music(model_music data) {
        this.data=data;
        initComponents();
        setOpaque(false);
        lbtext.setText(data.getName());
        lbtime.setText(data.getTime());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbicon = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        lbtext = new javax.swing.JLabel();

        lbicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbtime.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtime.setForeground(new java.awt.Color(51, 51, 51));
        lbtime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbtime.setText("03:00");

        lbtext.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbtext.setForeground(new java.awt.Color(51, 51, 51));
        lbtext.setText("Music Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbicon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbtext, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbicon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    protected void paintComponent(Graphics grph){

            Graphics2D g2=(Graphics2D) grph;
            g2.setColor(Color.WHITE);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(246,246,246));
            g2.fillRect(0, getHeight()-2, getWidth(), getHeight());
        super.paintComponent(grph);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbicon;
    private javax.swing.JLabel lbtext;
    private javax.swing.JLabel lbtime;
    // End of variables declaration//GEN-END:variables
}
