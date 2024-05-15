
package Model;

import javax.swing.Icon;

/**
 *
 * @author user
 */
public class Text_Model {

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Text_Model(String topic, String description, Icon icon) {
        this.topic = topic;
        this.description = description;
        this.icon = icon;
    }

    public Text_Model() {
    } 
    
    private String topic;
    private String description;
    private Icon icon;
    
}
