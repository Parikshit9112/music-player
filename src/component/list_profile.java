
package component;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.model_profile;
public class list_profile<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    public list_profile(){
        model=new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }
    
    @Override
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index,boolean selected,boolean focus){
                model_profile data;
                if((o instanceof model_profile)){
                    data=(model_profile) o;
                }
                else{
                    data=new model_profile("Name","Description",new ImageIcon(getClass().getResource("/icon/artists_selected.png")));
                }
                item_profile item=new item_profile(data);
                return item;
            }
        };
    }
    
    public void addItem(model_profile data){
        model.addElement(data);
    }
}
