package de.srh.tetteh.UI.terminal;

public abstract class  Menu implements IMenu {

    private String name = "Menu";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showDialog(){
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
