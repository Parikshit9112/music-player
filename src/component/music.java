
package component;

import model.model_music;


public class music extends javax.swing.JPanel {

    public music() {
        initComponents();
        init();
    }
    
    private void init(){
        list.addItem(new model_music("1", "No Music", "00:00"));
        list.addItem(new model_music("2", "No Music", "00:00"));
        list.addItem(new model_music("4", "No Music", "00:00"));
        list.addItem(new model_music("5", "No Music", "00:00"));
        list.addItem(new model_music("6", "No Music", "00:00"));
        list.addItem(new model_music("7", "No Music", "00:00"));
       
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list = new component.list_music<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Most Trending Music");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(289, Short.MAX_VALUE))
            .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(list, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private component.list_music<String> list;
    // End of variables declaration//GEN-END:variables
}
