package Controller;

import View.ShapeView;
import java.util.Scanner;

public class ShapeController {

    private Scanner sc = new Scanner(System.in);
    ShapeView view = new ShapeView();

    public void input(){
        view.input();
    }
    
    public void output(){
        view.output();
    }
    
}