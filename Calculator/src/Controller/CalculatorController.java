package Controller;

import Model.CalculatorModel;
import java.util.Scanner;

public class CalculatorController {

    Scanner sc = new Scanner(System.in);

    public enum Operator {
        Add("+"),
        Sub("-"),
        Multi("*"),
        Div("/"),
        Power("^"),
        Equal("=");

        private final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    public enum BMI {
        UNDERWEIGHT,
        STANDARD,
        OVERWEIGHT,
        FAT,
        VERYFAT
    }
    Validation valid = new Validation();
    public Operator checkOperator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operator (+, -, x, /, ^, =): ");
        String operator = scanner.nextLine();

        for (Operator op : Operator.values()) {
            if (op.getSymbol().equals(operator)) {
                return op;
            }
        }

        System.out.println("Invalid operator. Please enter a valid operator.");
        return checkOperator();
    }
    double a, b;

    public void normalCalculate() {
        a = valid.checkValidNum("Enter number: ");
        double memory = 0;

        do {
            Operator op = checkOperator();

            switch (op) {
                case Add:
                    b = valid.checkValidNum("Enter number: ");
                    if (memory == 0) {
                        memory = a + b;
                    } else {
                        memory += b;
                    }
                    break;
                case Sub:
                    b = valid.checkValidNum("Enter number: ");
                    if (memory == 0) {
                        memory = a - b;
                    } else {
                        memory -= b;
                    }
                    break;
                case Multi:
                    b = valid.checkValidNum("Enter number: ");
                    if (memory == 0) {
                        memory = a * b;
                    } else {
                        memory *= b;
                    }
                    break;
                case Div:
                    b = valid.checkValidNum("Enter number: ");
                    if (memory == 0) {
                        if (b != 0) {
                            memory = a / b;
                        } else {
                            System.out.println("Error: Cannot divide by zero");
                            return;
                        }
                    } else {
                        if (b != 0) {
                            memory /= b;
                        } else {
                            System.out.println("Error: Cannot divide by zero");
                            return;
                        }
                    }
                    break;
                case Power:
                    b = valid.checkValidNum("Enter number: ");
                    if (memory == 0) {
                        memory = Math.pow(a, b);
                    } else {
                        memory = Math.pow(memory, b);
                    }
                    break;
                case Equal:
                    System.out.println("Result: " + memory);
                    return;
            }

            System.out.println("Memory: " + memory);
        } while (true);
    }

    public boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public BMI calculateBMI(double weight, double height) {
        double bmi = weight / (Math.pow(height / 100, 2));
        if (bmi < 19) {
            return BMI.UNDERWEIGHT;
        } else if (bmi >= 19 && bmi <= 25) {
            return BMI.STANDARD;
        } else if (bmi > 25 && bmi <= 30) {
            return BMI.OVERWEIGHT;
        } else if (bmi > 30 && bmi <= 40) {
            return BMI.FAT;
        } else {
            return BMI.VERYFAT;
        }
    }
    double weight, height;

    public void BMICalculator() {
        weight = valid.checkValidNum("Enter weight: ");
        height = valid.checkValidNum("Enter height: ");
        CalculatorModel model = new CalculatorModel(0, 0, null, weight, height);
        double bmi = model.getWeight() / (Math.pow(model.getHeight() / 100, 2));
        System.out.printf("BMI number: %3.2f", bmi);
        System.out.println("\nBMI Status: " + calculateBMI(weight, height));
    }
}
