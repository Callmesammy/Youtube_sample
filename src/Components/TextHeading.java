
package Components;

import Model.Text_Model;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class TextHeading extends javax.swing.JPanel {

   
    public TextHeading() {
        initComponents();
        setOpaque(false);
        init();
    }
public void init(){
    setPreferredSize(new Dimension(250,150));
    setMaximumSize(new Dimension(250,150));
    setMinimumSize(new Dimension(250,150));
}
   private Text_Model data;
public void addImage(Text_Model data){
    this.data = data;
    isTopic.setText(data.getTopic());
    isDescription.setText(data.getDescription());
    
    
    repaint();
}

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size = getAutoSize(data.getIcon());
       g2.drawImage(getImage(data.getIcon()), size.x,size.y,size.width,size.height, null);
        super.paintComponent(g); 
    }
public Image getImage(Icon image){
    return ((ImageIcon)image).getImage();
}
 private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = getWidth() / 2 - (width / 2);
        int y = getHeight() / 2 - (height / 2);
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isTopic = new javax.swing.JLabel();
        isDescription = new javax.swing.JLabel();

        isTopic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        isTopic.setForeground(new java.awt.Color(255, 255, 255));
        isTopic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isTopic.setText("TOPICS");

        isDescription.setForeground(new java.awt.Color(255, 255, 255));
        isDescription.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(isDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(isTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isDescription)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel isDescription;
    private javax.swing.JLabel isTopic;
    // End of variables declaration//GEN-END:variables
}
