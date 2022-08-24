
package youtube_sample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;


public class Shapes extends javax.swing.JPanel {

    
    public Shapes() {
        initComponents();
        setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BufferedImage img = new BufferedImage(getWidth()-10, 250, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g3 = img.createGraphics();
        g3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = img.getWidth();
        int height = img.getHeight()-1;
        int radius = 23;
        
        g3.setColor(new Color(253,253,253));
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0,radius);
        f.curveTo(0, radius, 0, 0, radius, 0);
        f.lineTo(width-radius, 0);
        f.curveTo(width-radius, 0, width-radius, 20, width-14, radius);
        f.lineTo(width+radius, +radius);
        f.curveTo(width+radius, 0  , 0, 0, 0, radius);
       
      
        
      
        
       
        
        g3.draw(f);
        g2.drawImage(img, 0, 0, null);
        
        
        super.paintComponent(g); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
