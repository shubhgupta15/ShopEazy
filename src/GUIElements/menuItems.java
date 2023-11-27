/*
Allows the coder to add additional menu items
*/


package GUIElements;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.Icon;

public class menuItems extends javax.swing.JPanel {
    
    private boolean selected;
    private boolean hover;


    public menuItems(modelMenu data) {
        initComponents();
        setOpaque(false);
        
        //for menu item
        if(data.getType() == modelMenu.menuType.MENU) {
            labelIcon.setIcon((Icon) data.toIcon());
            labelName.setText(data.getName());
        } else if (data.getType() == modelMenu.menuType.TITLE) {    // for title items
            labelName.setText(data.getName());
            labelIcon.setFont(new Font("Helvetica", 1, 12));
            labelName.setVisible(false);
        } else { // for empty
            labelName.setText(" ");
        }
    }
    
    // checks for selected
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    // checks for hover
    public void setHover(boolean hover) {
        this.hover = hover;
        repaint();
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIcon = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();

        labelIcon.setForeground(new java.awt.Color(255, 255, 255));

        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelIcon)
                .addGap(18, 18, 18)
                .addComponent(labelName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // UI elements
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || hover) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 30));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables
}
