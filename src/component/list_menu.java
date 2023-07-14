
package component;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import model.model_menu;
public class list_menu<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    public list_menu(){
        model=new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }
    
    @Override
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index,boolean selected,boolean focus){
                model_menu data;
                if((o instanceof model_menu)){
                    data=(model_menu) o;
                }
                else{
                    data=new model_menu("No Data","song");
                }
                item_menu item=new item_menu(data);
                item.setSelected(selected);
                return item;
            }
        };
    }
    
    public void addItem(model_menu data){
        model.addElement(data);
    }
}
