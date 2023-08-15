
package component;

import static component.music.mo;
import static component.music.selectedSong;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class bottom extends javax.swing.JPanel {
    public static int loop;
    public static int playststatus;
    public bottom() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(68,68,68));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slider1 = new swing.Slider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        button_repeat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        buttonplay = new javax.swing.JButton();
        button_prevPLay = new javax.swing.JButton();
        button_nexPlay = new javax.swing.JButton();

        slider1.setMaximum(200);
        slider1.setValue(60);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("03:25");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("01:27");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/speaker.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button_repeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/repeat.png"))); // NOI18N
        button_repeat.setBorder(null);
        button_repeat.setContentAreaFilled(false);
        button_repeat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_repeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_repeatActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        buttonplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/playing.png"))); // NOI18N
        buttonplay.setBorder(null);
        buttonplay.setContentAreaFilled(false);
        buttonplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonplayActionPerformed(evt);
            }
        });

        button_prevPLay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        button_prevPLay.setBorder(null);
        button_prevPLay.setContentAreaFilled(false);
        button_prevPLay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_prevPLay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_prevPLayActionPerformed(evt);
            }
        });

        button_nexPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next.png"))); // NOI18N
        button_nexPlay.setBorder(null);
        button_nexPlay.setContentAreaFilled(false);
        button_nexPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_nexPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nexPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(button_prevPLay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_nexPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonplay, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(button_nexPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_prevPLay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(button_repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_repeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonplayActionPerformed
       switch(playststatus){
            case 0: playststatus=1;
                    buttonplay.setIcon(new ImageIcon(getClass().getResource("/icon/pause.png")));
                    System.out.println("playststatus : " +playststatus);
                    if(mo.player!=null){
                        mo.stopPlayer();
                        mo.resumePlayer();
                    }
                    break;
            case 1: playststatus=0;
                    if(mo.player!=null){
                        mo.pausePlayer();
                    }
                    buttonplay.setIcon(new ImageIcon(getClass().getResource("/icon/playing.png")));
                    System.out.println("playststatus : " +playststatus);
                    break;
        }
    }//GEN-LAST:event_buttonplayActionPerformed

    private void button_nexPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_nexPlayActionPerformed
        mo.jumpTrack(selectedSong);
        mo.nextTrack();
    }//GEN-LAST:event_button_nexPlayActionPerformed

    private void button_repeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_repeatActionPerformed
           switch(loop){
            case 0: loop =1;
                    button_repeat.setIcon(new ImageIcon(getClass().getResource("/icon/loop.png")));
                    System.out.println("loop : " +loop);
                    break;
            case 1: loop=0;
                    button_repeat.setIcon(new ImageIcon(getClass().getResource("/icon/repeat.png")));
                    System.out.println("loop : " +loop);
                    break;
        }
    }//GEN-LAST:event_button_repeatActionPerformed

    private void button_prevPLayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_prevPLayActionPerformed
        mo.jumpTrack(selectedSong);
        mo.prevTrack();
    }//GEN-LAST:event_button_prevPLayActionPerformed
    
    @Override
    protected void paintComponent(Graphics grph){
        Graphics2D g2=(Graphics2D) grph;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0,getWidth(),getHeight(),20, 20);
        g2.fillRect(0,0,getWidth(),25);
        super.paintComponent(grph);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_nexPlay;
    private javax.swing.JButton button_prevPLay;
    private javax.swing.JButton button_repeat;
    public static javax.swing.JButton buttonplay;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private swing.Slider slider1;
    // End of variables declaration//GEN-END:variables
}
