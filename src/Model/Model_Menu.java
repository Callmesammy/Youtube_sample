
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
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
     * @return the Type
     */
    public MenuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(MenuType Type) {
        this.Type = Type;
    }
    private String icon;
    private String name;
    private MenuType Type;

    public Model_Menu(String icon, String name, MenuType Type) {
        this.icon = icon;
        this.name = name;
        this.Type = Type;
    }

    public Model_Menu() {
    }
    
    public static enum MenuType{
        MENU, TITLE, EMPTY
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/some/icon/" +icon+ ".png"));
    }
}
