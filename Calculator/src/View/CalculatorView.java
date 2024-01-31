package View;

import Model.CalculatorModel;
import Controller.CalculatorController;


public class CalculatorView extends Menu {

    CalculatorController a = new CalculatorController();

    public CalculatorView() {
        super(new String[]{"Normal calculator", "BMI calculator", "Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("-------------Normal Calculator---------------");
                a.normalCalculate();
                break;
            case 2:
                System.out.println("-------------BMI Calculator---------------");
                a.BMICalculator();
                break;
            case 3:
                System.out.println("Good bye. Have a good day.\nExiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice");

                break;
        }
    }
}
