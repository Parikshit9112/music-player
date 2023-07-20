
package model;

import javax.swing.Icon;


public class model_popular {

    
    public Icon getImage() {
        return image;
    }

    
    public void setImage(Icon image) {
        this.image = image;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description;
    }
    
    public model_popular(Icon image,String title,String description){
        this.image=image;
        this.title=title;
        this.description=description;
    }
    private Icon image;
    private String title;
    private String description;

   
}
