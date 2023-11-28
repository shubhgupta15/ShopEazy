
package itemCards;

public class quinoa extends javax.swing.JPanel {

    public quinoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Organic Quinoa");

        labelPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(0, 0, 0));
        labelPrice.setText("$16.25");

        labelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/instant-pot-quinoa-20-20211203 (2).jpg"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Enhance your meals with this versatile and nutritious organic quinoa.\nA great source of protein and fiber, it's a staple for salads, bowls, and\nsides.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrice)
                    .addComponent(labelName))
                .addContainerGap(494, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(296, Short.MAX_VALUE)
                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPrice)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    // End of variables declaration//GEN-END:variables
}
