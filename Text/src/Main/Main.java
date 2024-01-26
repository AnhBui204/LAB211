package Main;

import Controller.TextController;
import View.TextView;

public class Main {
                                    
    public static void main(String[] args) {
        TextView view = new TextView();
        new TextController(view).run();
    }
}
