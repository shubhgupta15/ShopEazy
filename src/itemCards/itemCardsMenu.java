// panel used to put all the item cards together in a layered panel

package itemCards;

public class itemCardsMenu extends javax.swing.JPanel {

    public itemCardsMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        honey2 = new itemCards.honey();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        winebliss1 = new itemCards.winebliss();
        eggs2 = new itemCards.eggs();
        avacadoes2 = new itemCards.avacadoes();
        coffee2 = new itemCards.coffee();
        quinoa2 = new itemCards.quinoa();
        fillets2 = new itemCards.fillets();
        loaf2 = new itemCards.loaf();
        fbasket2 = new itemCards.fbasket();
        pasta2 = new itemCards.pasta();
        honey3 = new itemCards.honey();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane2.setLayout(new java.awt.GridLayout(10, 0, 5, 10));
        jLayeredPane2.add(winebliss1);
        jLayeredPane2.add(eggs2);
        jLayeredPane2.add(avacadoes2);
        jLayeredPane2.add(coffee2);
        jLayeredPane2.add(quinoa2);
        jLayeredPane2.add(fillets2);
        jLayeredPane2.add(loaf2);
        jLayeredPane2.add(fbasket2);
        jLayeredPane2.add(pasta2);
        jLayeredPane2.add(honey3);

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
    private itemCards.avacadoes avacadoes2;
    private itemCards.coffee coffee2;
    private itemCards.eggs eggs2;
    private itemCards.fbasket fbasket2;
    private itemCards.fillets fillets2;
    private itemCards.honey honey2;
    private itemCards.honey honey3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private itemCards.loaf loaf2;
    private itemCards.pasta pasta2;
    private itemCards.quinoa quinoa2;
    private itemCards.winebliss winebliss1;
    // End of variables declaration//GEN-END:variables
}
