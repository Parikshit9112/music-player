
package model;
import static component.bottom.playststatus;

import static component.music.list;
import component.bottom;
import static component.bottom.buttonplay;

import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class music_operation{
    FileInputStream fis;
    BufferedInputStream bis;
    public Player player;
    public long pauseLocation;
    public long songTotalLength;
    public static String songLocation;
    int playstatus=0;
    int trackNo=0;
   
    ArrayList<String> selectedFile=new song().getSongsFromFolder("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\file_list\\src\\song");
  
    public void pausePlayer()
	{
		if(player != null)
		{
			try 
			{
				pauseLocation=fis.available();
                               
				player.close();
			}
			catch (IOException e) 
			{}
		}
	}
    
    
    public void resumePlayer()
	{
		
		try 
		{
			 System.out.println(songLocation);
			fis=new FileInputStream(songLocation);
                         System.out.println(fis);
                        System.out.println(songLocation);
			bis=new BufferedInputStream(fis);
			player=new Player(bis);
			songTotalLength=fis.available();
			//playstatus=1;
			fis.skip(songTotalLength-pauseLocation);
	
		}
		catch (FileNotFoundException  | JavaLayerException ex) 
		{
			
			JOptionPane.showMessageDialog(null,ex);
			stopPlayer();
		} 
		catch (IOException e) 
		{}
		new Thread()
		{
			public void run()
			{
				try
				{
					player.play();
					if(player.isComplete() && bottom.loop==1){
                                           playSong(songLocation);
					}
				}
				catch (JavaLayerException e) 
				{
					JOptionPane.showMessageDialog(null,e);
					songLocation="";
					playstatus=0;
					
				
					
				}
			}
		}.start();
		
	}
    
    public void stopPlayer()
	{
		try
		{	
			player.close();
                        
		}catch(Exception e) {}
	}
    //play function
    public void playSong(String path)
	{
		try 
		{
			fis=new FileInputStream(path);
			bis=new BufferedInputStream(fis);
			player=new Player(bis);
			songTotalLength=fis.available();			
			//playstatus=1;
			songLocation=path+"";	
		}
		catch (FileNotFoundException  | JavaLayerException ex) 
		{
			playstatus=0;
			
		} 
		catch (IOException e) 
		{}
		new Thread()
		{
			public void run()
			{
				try
				{
					player.play();
                                      
					 buttonplay.setIcon(new ImageIcon(getClass().getResource("/icon/pause.png")));
                                         
					if(player.isComplete() && bottom.loop==1){
                                           playSong(songLocation);
					}
				}
				catch (JavaLayerException e) 
				{
					songLocation="";
					playstatus=0;
					
				}
			}
		}.start();
		
	}
      
    
  public void prevTrack()
	{
		try
		{
			if(trackNo==0)
				trackNo=selectedFile.size();
		
			player.close();
			trackNo--;
		}
		catch(Exception e2) {}
		
		if(trackNo == 0)
		{
			jumpTrack(selectedFile.size()-1);
		}
		else
		{
			try
			{
			list.setSelectedIndex(trackNo);
                           
                        list.repaint();
			}catch(Exception e) {}
		}
	}
   
    
  public void nextTrack()
	{
		try
		{
			if(trackNo==selectedFile.size()-1)
				trackNo=-1;
			
			player.close();
			trackNo++;
		}
		catch(Exception e2){}
		
		if(trackNo == 0 && selectedFile.size()-1 == 0)
		{
			jumpTrack(trackNo);
		}
		else
		{
			try
			{
				list.setSelectedIndex(trackNo);
                                list.repaint();
			}catch(Exception e) {}
		}
	}
  
  public void jumpTrack(int index)
	{
		try
		{	
			player.close();
			trackNo = index;
			songLocation="C:\\Users\\ASUS\\Documents\\NetBeansProjects\\file_list\\src\\song\\"+selectedFile.get(trackNo);
                }
		catch(Exception e2){}
		if(selectedFile.get(trackNo)==null && playstatus!=0)
			playSong(songLocation);        
	}
  
  
}
