
package Slider_Animation.panel;

import java.awt.Component;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class Slide extends javax.swing.JLayeredPane {

    private final JPanel panel;
    private final Animator animate;
    private final MigLayout layout;
    private Component componentShow;
    private Component componentOut;
    private boolean selected;
    private int selectedIndex;
    
    public Slide() {
        initComponents();
        layout = new MigLayout("inset 0");
        panel = new JPanel();
        TimingTarget target = new TimingTargetAdapter(){
        };
        
        animate = new Animator(0, target);
        animate.setResolution(0);
        animate.setAcceleration(0.5f);
        animate.setDeceleration(0.5f);
        panel.setLayout(layout);
        setLayout(new MigLayout("fill,inset  0", "[fill, center]","3[fill]3"));
        add(panel, "w 100%");
    }

    public void setSlider (Component ...com){
        if (com.length >= 2) {
            for (Component coms : com) {
                coms.setVisible(false);
                panel.add(coms, "pos 0 0 0 0");
            }
              if (panel.getComponentCount()>0) {
            componentShow = panel.getComponent(0);
            componentShow.setVisible(false);
            layout.setComponentConstraints(componentShow, "pos 0 0 100% 100%");
        }
      
        }
       
        }
         public void next(){
            if (!animate.isRunning()) {
                selected = true;
                selectedIndex = getnext(selectedIndex);
                componentShow = panel.getComponent(selectedIndex);
                componentOut = panel.getComponent(checknext(selectedIndex +1));
            }
         
    }
    private int getnext(int index){
        if (index == panel.getComponentCount()-1) {
            return 0;
        }else{
            return index+1;
        }
              
          }
    private int checknext(int index){
        if (index == -1) {
            return panel.getComponentCount() -1;
        }else{
            return index;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
