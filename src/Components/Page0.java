/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Model.Text_Model;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class Page0 extends javax.swing.JPanel {

    /**
     * Creates new form Page1
     */
    public Page0() {
        initComponents();
        addStuff();
    }

    private  void addStuff(){
     heading.adimage(new Text_Model("BurnaBou", "Burna boy is a Nigerian Musician", new ImageIcon(getClass().getResource("/pictures/no/007.jpg"))));
     heading.adimage(new Text_Model("BurnaBou", "Burna boy is a Nigerian Musician", new ImageIcon(getClass().getResource("/pictures/no/007.jpg"))));
     heading.adimage(new Text_Model("BurnaBou", "Burna boy is a Nigerian Musician", new ImageIcon(getClass().getResource("/pictures/no/007.jpg"))));
     heading.adimage(new Text_Model("BurnaBou", "Burna boy is a Nigerian Musician", new ImageIcon(getClass().getResource("/pictures/no/007.jpg"))));
     heading.adimage(new Text_Model("BurnaBou", "Burna boy is a Nigerian Musician", new ImageIcon(getClass().getResource("/pictures/no/007.jpg"))));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        heading = new Components.WelcomeHeading();

        setBackground(new java.awt.Color(102, 102, 0));
        setForeground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

@Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 23, 23);
        g2.fillRect(getWidth()-23, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.WelcomeHeading heading;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
