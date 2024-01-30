package Main;

import Views.EquationView;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        new EquationView(choices, "Equation Program");
    }
}
