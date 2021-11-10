import ui.Menu;

public class HaikuApplication {
    private Menu menu = new Menu();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();
        app.menu.welcomeUser();
    }
}
