
package component;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import model.model_music;
public class list_music<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    private int playIndex=-1;
    
    public list_music(){
        model=new DefaultListModel();
        setModel(model);
        setOpaque(false);
        addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            if(SwingUtilities.isLeftMouseButton(e)){
                playIndex =locationToIndex(e.getPoint());
                repaint();
            }
        }
    });
    }
    
    @Override
    public ListCellRenderer getCellRenderer(){
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> jlist,Object o,int index,boolean selected,boolean focus){
               model_music data;
                if((o instanceof model_music)){
                    data=(model_music) o;
                }
                else{
                    data=new model_music("1","No Music","00:00");
                }
                item_music item=new item_music(data);
                item.setplay(index==playIndex);
                return item;
            }
        };
    }
    
    public void addItem(model_music data){
        model.addElement(data);
    }
}
