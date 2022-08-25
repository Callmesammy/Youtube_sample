
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Model_Menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the Type
     */
    public menuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(menuType Type) {
        this.Type = Type;
    }
    private String icon;
    private String name;
    private String description;
    private menuType Type;

    public Model_Menu(String icon, String name, String description, menuType Type) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.Type = Type;
    }

    public Model_Menu() {
    }
      public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/some/icon/" +icon+ ".png"));
    }
    public static enum menuType {
        MENU, TITLE, EMPTY
    }
}
