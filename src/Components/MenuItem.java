
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class MenuItem extends javax.swing.JPanel {

    /**
     * @param next the next to set
     */
  
   private boolean next;
   private boolean selected;
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.MenuType.MENU) {
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getName());
            
            
        }else if (data.getType()==Model_Menu.MenuType.TITLE) {
            ibicon.setText(data.getName());
            ibicon.setFont(new Font("sansserif", 1, 12));
            ibiname.setVisible(false);
            
        }else if (data.getType()==Model_Menu.MenuType.EMPTY) {
            ibiname.setText(" ");
        }
    }
  public void setNext(boolean next) {
        this.next = next;
        repaint();
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
        ibiname.setText("Data Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibicon)
                .addGap(18, 18, 18)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected || next) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                 g2.setColor(new Color(255,255,255,80));
            }else{
                 g2.setColor(new Color(255,255,255,20));
            }
       
        g2.fillRoundRect(3, 0, getWidth()-10, getHeight(), 15, 15);  
        }
        
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
