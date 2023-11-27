package GUIElements;

import javax.swing.Icon;

public class modelCard {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    
    
    public modelCard(Icon icon, String title, String price) {
        this.icon = icon;
        this.title = title;
        this.price = price;
    }

    public modelCard() {
    }
    
    private Icon icon;
    private String title;
    private String price;
    
    
}
