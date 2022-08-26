
package Components;

import Model.Model_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;


public class ListMenu <E extends Object> extends JList<E>{

    private final DefaultListModel model;
    private  int selectedIndex = -1;
    private int next = -1;

    public ListMenu(DefaultListModel model) {
        this.model = model;
    }
    
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object value = model.getElementAt(index);
                    if (value instanceof Model_Menu) {
                        Model_Menu data;
                       Model_Menu menu = (Model_Menu)value;
                            if(menu.getType()==Model_Menu.MenuType.MENU){
                                selectedIndex = index;
                            }
                        }else{
                        selectedIndex = index;
                        
                    }
                    
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
              next =-1;
              selectedIndex = -1;
              repaint();
            }
            
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                    int index = locationToIndex(e.getPoint());
                    if (index != 0) {
                        Object value = model.getElementAt(index);
                        if (value instanceof Model_Menu) {
                            Model_Menu data = (Model_Menu)value;
                            if (data.getType()==Model_Menu.MenuType.MENU) {
                                next = index;
                            }
                            
                            }else{
                            next = -1;
                        }
                     repaint();
                }
               
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
        });
        
        
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Model_Menu data;
                if (value instanceof Model_Menu) {
                   data = (Model_Menu)value;
                }else{
                     data = new Model_Menu("", value+ "",Model_Menu.MenuType.EMPTY);
                }
                MenuItem item = new MenuItem(data);
                item.setSelected(selectedIndex ==index);
                item.setNext(next == index);
                return item;
            }
            
        };
        
    }
    
    public void addItem(Model_Menu data){
        model.addElement(data);
    }
    
    
}
