package component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.model_menu;
import model.model_profile;

public class item_profile extends javax.swing.JPanel {

    public model_profile getData() {
        return data;
    }

    private final model_profile data;
   
    public item_profile(model_profile data) {
        this.data=data;
        initComponents();
        setOpaque(false);
        lbname.setText(data.getName());
        lbdesc.setText(data.getDescription());
        if(data.getImage()!=null){
            imageAvatar.setImage(data.getImage());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbname = new javax.swing.JLabel();
        lbdesc = new javax.swing.JLabel();
        imageAvatar = new swing.ImageAvatar();

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        lbname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbname.setForeground(new java.awt.Color(51, 51, 51));
        lbname.setText("Name");
        jPanel1.add(lbname);

        lbdesc.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbdesc.setForeground(new java.awt.Color(115, 115, 115));
        lbdesc.setText("Description");
        jPanel1.add(lbdesc);

        imageAvatar.setBorderSize(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar imageAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbdesc;
    private javax.swing.JLabel lbname;
    // End of variables declaration//GEN-END:variables
}
