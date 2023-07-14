package model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class model_menu {
    private String menuName;
    private String icon;
    
    public String getMenuName(){
        return menuName;
    }
    public void setMenuName(String menuName){
        this.menuName=menuName;
    }
    public String getIcon(){
        return icon;
    }
    public void setIcon(String icon){
        this.icon=icon;
    }
    
    public model_menu(String menuName,String icon){
        this.menuName=menuName;
        this.icon=icon;
    }
    public model_menu(){
        
    }
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/icon/"+icon+".png"));
    }
    public Icon toIconSelected(){
        return new ImageIcon(getClass().getResource("/icon/"+icon+"_selected.png"));
    }
    
        
}
