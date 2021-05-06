package domain;

public class Pages {
    private int id;
    private Menu menu;
    private AboutInfo aboutInfo;
    private Wall wall;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public AboutInfo getAboutInfo() {
        return aboutInfo;
    }

    public void setAboutInfo(AboutInfo aboutInfo) {
        this.aboutInfo = aboutInfo;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
