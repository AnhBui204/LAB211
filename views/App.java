package views;

public class App{
    public static void main(String[] args) {
        String[] choices = {"Sort", "Search", "Exit"};
        new MainMenu("MAIN MENU", choices).run();
    }
}
