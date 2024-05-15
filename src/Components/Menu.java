
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;
    
    public void AddEventMenuSelected(EventMenuSelected event){
        this.event=event;
        listMenu1.AddEventMenuSelected(event);
        repaint();
    }
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init(){
        listMenu1.setOpaque(false);
        listMenu1.addItem(new Model_Menu("", "Selected Items", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("01", "Menu index", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("02", "Get Index", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("03", "Get Index", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("06", "Get Index", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "Select Ouput", Model_Menu.MenuType.TITLE));
        listMenu1.addItem(new Model_Menu("1", "Game on", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2", "Bring it", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "Leave it ", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "See it", Model_Menu.MenuType.MENU));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listMenu1 = new Components.ListMenu<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/some/icon/user.png"))); // NOI18N
        jLabel1.setText("Give Them");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
 @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g3 = new GradientPaint(0, 0, Color.decode("#8E2DE2"), 0, getHeight(), Color.decode("#4A00E0"), true);
        g2.setPaint(g3);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 23, 23);
        g2.fillRect(getWidth()-23, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Components.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
