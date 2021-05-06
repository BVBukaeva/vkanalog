package domain;

import java.util.List;

public class Menu {
    private int id;
    private List<String> buttonNames;

    public List<String> getButtonNames() {
        return buttonNames;
    }

    public void setButtonNames(List<String> buttonNames) {
        this.buttonNames = buttonNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
