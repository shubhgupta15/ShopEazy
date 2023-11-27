// panel used to put all the item cards together in a layered panel

package itemCardsForCart;

import itemCards.*;

public class shoppingCartMenu extends javax.swing.JPanel {

    public shoppingCartMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        winebliss3 = new itemCards.winebliss();
        eggs1 = new itemCards.eggs();
        avacadoes2 = new itemCardsForCart.avacadoes();
        honey1 = new itemCards.honey();
        pasta1 = new itemCards.pasta();
        fbasket1 = new itemCards.fbasket();
        loaf1 = new itemCards.loaf();
        fillets1 = new itemCards.fillets();
        quinoa1 = new itemCards.quinoa();
        coffee1 = new itemCards.coffee();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane2.setLayout(new java.awt.GridLayout(10, 0, 5, 10));
        jLayeredPane2.add(winebliss3);
        jLayeredPane2.add(eggs1);
        jLayeredPane2.add(avacadoes2);
        jLayeredPane2.add(honey1);
        jLayeredPane2.add(pasta1);
        jLayeredPane2.add(fbasket1);
        jLayeredPane2.add(loaf1);
        jLayeredPane2.add(fillets1);
        jLayeredPane2.add(quinoa1);
        jLayeredPane2.add(coffee1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 3880, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private itemCardsForCart.avacadoes avacadoes2;
    private itemCards.coffee coffee1;
    private itemCards.eggs eggs1;
    private itemCards.fbasket fbasket1;
    private itemCards.fillets fillets1;
    private itemCards.honey honey1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private itemCards.loaf loaf1;
    private itemCards.pasta pasta1;
    private itemCards.quinoa quinoa1;
    private itemCards.winebliss winebliss3;
    // End of variables declaration//GEN-END:variables
}
