
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu_Item extends javax.swing.JPanel {

    /**
     * @param selected the selected to set
     */
 

    private boolean selected;
    
   private Model_Menu data;
    public Menu_Item(Model_Menu data) {
        initComponents();
        if (data.getType()==Model_Menu.menuType.MENU) {
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getName());
        }else if(data.getType()==Model_Menu.menuType.TITLE){
            ibicon.setText(data.getName());
            ibicon.setFont(new Font("sansserif", 1, 13));
            ibiname.setVisible(false);
            
        }else if (data.getType()==Model_Menu.menuType.EMPTY) {
            ibiname.setText(" ");
        }
    }
       public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibicon = new javax.swing.JLabel();
        ibiname = new javax.swing.JLabel();

        ibicon.setForeground(new java.awt.Color(255, 255, 255));

        ibiname.setForeground(new java.awt.Color(255, 255, 255));
        ibiname.setText("Name of Stuff");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ibicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255,255,255,80));
        g2.fillRect(0, 0, getWidth(), getHeight()); 
        }
       
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
