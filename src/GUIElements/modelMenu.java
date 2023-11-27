//java class to for getters and setters of the menu list.
package GUIElements;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class modelMenu {

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public menuType getType() {
        return type;
    }

    public void setType(menuType type) {
        this.type = type;
    }
    
    public modelMenu(String icon, String name, menuType type){
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
    
    public modelMenu(){
        
    }
    
    String icon;
    String name;
    
    menuType type;
    
    public Icon toIcon(){
        return new ImageIcon(System.getProperty("user.dir") + ("C:\\Users\\shubh\\OneDrive\\Desktop\\ShopEazy\\src\\resources\\" + icon + ".png"));
    }
    
    public static enum menuType{
        TITLE, MENU, EMPTY;
    }
    
}
