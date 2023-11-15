package de.srh.tetteh.UI.terminal;

public class Exit extends Menu {
    private final String MENU_NAME = "Exit";

    public Exit(){
        this.setName(MENU_NAME);
    }

    @Override
    public void showDialog() {
        super.showDialog();
        System.out.println(MENU_NAME);
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
