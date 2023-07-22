
package form;

import model.model_popular;
import javax.swing.ImageIcon;

public class form_artists extends javax.swing.JPanel {

    public form_artists() {
        initComponents();
        init();
    }
    
    private void init(){
        most_popular.addImage(new model_popular(new ImageIcon(getClass().getResource("/icon/test/ar1.jpg")),"A. R. Rahman","15 Albums | 17.5M Follower"));
        most_popular.addImage(new model_popular(new ImageIcon(getClass().getResource("/icon/test/arijit1.jpeg")), "Arijit Singh", "15 Albums | 17.5M Mollowers"));
        most_popular.addImage(new model_popular(new ImageIcon(getClass().getResource("/icon/test/kk1.jpg")), "KK", "15 Albums | 17.5M Followers"));
        most_popular.addImage(new model_popular(new ImageIcon(getClass().getResource("/icon/test/karan3.jpg")), "Karan Aujla", "15 Albums | 17.5M Followers"));
        most_popular.addImage(new model_popular(new ImageIcon(getClass().getResource("/icon/test/sidhu2.jpg")),"Sidhu Moose Wala","15 Albums | 17.5M Follower"));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        most_popular = new component.most_popular();
        music1 = new component.music();
        profile1 = new component.profile();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 29, 177));
        jLabel1.setText("Artists");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setText("Most Popular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(809, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(music1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(most_popular, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(most_popular, javax.swing.GroupLayout.PREFERRED_SIZE, 219, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(music1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private component.most_popular most_popular;
    private component.music music1;
    private component.profile profile1;
    // End of variables declaration//GEN-END:variables
}
