
package component;

import static component.bottom.buttonplay;
import model.model_music;
import model.music_operation;
import model.song;
import java.util.ArrayList;
import static component.bottom.playststatus;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class music extends javax.swing.JPanel {
    public static music_operation mo=new music_operation();
    public static ArrayList<String> songs=new song().getSongsFromFolder("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\file_list\\src\\song");
    public static int selectedSong;
    public music() {
        initComponents();
        init();
        list.addListSelectionListener( new SongSelectionListener());
    }
    
    private void init(){
         for(int i=0;i<songs.size();i++){
            list.addItem(new model_music(String.valueOf(i+1), songs.get(i).substring(0,songs.get(i).length()-4), "03:00"));
        }

    }
   
    
    private class SongSelectionListener implements ListSelectionListener {
   
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                // Stop the current song if it's playing
                  mo.stopPlayer();

                // Get the selected song's file path
                selectedSong = music.this.list.getSelectedIndex();
                System.out.println(selectedSong);
               String filePath = "C:\\Users\\ASUS\\Documents\\NetBeansProjects\\file_list\\src\\song\\"+songs.get(selectedSong);
                 
                // Play the new selected song
               mo.playSong(filePath);
               buttonplay.setIcon(new ImageIcon(getClass().getResource("/icon/pause.png")));
         
            }
        }
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
    public static component.list_music<String> list;
    // End of variables declaration//GEN-END:variables
}
