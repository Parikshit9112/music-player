
package model;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class song {
       String filename="";
       public ArrayList<String> songs = new ArrayList<>();
       public ArrayList<String> getSongsFromFolder(String folderPath) {
        filename=folderPath;
        
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        songs.add(file.getName());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"The specified folder does not exist or is not a directory.");
        }

        return songs;
    }
}
