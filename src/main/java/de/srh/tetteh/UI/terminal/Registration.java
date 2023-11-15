package de.srh.tetteh.UI.terminal;

public class Registration extends Menu {
    private final String MENU_NAME = "Registration";

    public Registration(){
        this.setName(MENU_NAME);
    }

    @Override
    public void showDialog() {
        super.showDialog();
        System.out.println(MENU_NAME);
    }
}
