package de.srh.tetteh.UI.terminal;

public class Login extends Menu {
    private final String MENU_NAME = "Login";

    public Login(){
        this.setName(MENU_NAME);
    }

    @Override
    public void showDialog() {
        super.showDialog();
        System.out.println(MENU_NAME);
    }
}
