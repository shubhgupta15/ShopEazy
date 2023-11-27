
package GUIElements;

import Events.menuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class menuList<E extends Object> extends JList<E>{
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int hoverIndex = -1;
    
    private menuSelected event;
    
    public void addMenuSelected(menuSelected event) {
        this.event = event;
    }
    
    public menuList() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me){
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof modelMenu) {
                        modelMenu menu = (modelMenu) o;
                        
                        if (menu.getType() == modelMenu.menuType.MENU) {
                            selectedIndex = index;
                            
                            if (event != null) {
                                event.selected(index);
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hoverIndex = -1;
                repaint();
            }
            
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != hoverIndex) {
                    Object o = model.getElementAt(index);
                    
                    if (o instanceof modelMenu) {
                        modelMenu menu = (modelMenu) o;
                        
                        if (menu.getType() == modelMenu.menuType.MENU) {
                            hoverIndex = index;
                        } else {
                            
                        }
                        repaint();
                    }
                }
            }
        });
        
        
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean isSelected, boolean cellHasFocus) {
                modelMenu data;
                
                if(o instanceof modelMenu) {
                    data = (modelMenu) o;
                } else {
                    data = new modelMenu("", o + "", modelMenu.menuType.EMPTY);
                }
                
                menuItems item = new menuItems(data);
                item.setSelected(selectedIndex == index);
                item.setHover(hoverIndex == index);
                return item;
            }
            
        };
    }
    
    public void addItem(modelMenu data) {
        model.addElement(data);
    }
    
}
