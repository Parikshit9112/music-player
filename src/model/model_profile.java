package model;

import javax.swing.Icon;

public class model_profile {

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }

    
    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }
    
    public model_profile(String name,String description,Icon image){
        this.name=name;
        this.description=description;
        this.image=image;
    }
    
    public model_profile(){
        
    }
    
    private String name;
    private String description;
    private Icon image;
    
}
