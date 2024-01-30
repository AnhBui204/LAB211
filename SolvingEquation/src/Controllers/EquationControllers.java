package Controllers;

import Views.EquationView;

public class EquationControllers {

    protected EquationView equationView;
    
    public EquationControllers(EquationView equationView) {
        this.equationView = equationView;
    }
    
    public void changeView(int choice){
        switch (choice) {
            case 1:
                equationView.calculateSuperlativeEquation();
                break;
            case 2:
                equationView.calculateQuadricEquation();
                break;
            case 3:
                System.out.println("Exit...");
            default:
        }
    }
}
