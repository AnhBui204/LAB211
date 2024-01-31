package Model;
import Controller.CalculatorController.Operator;

public class CalculatorModel {
    private double num;
    private double mem;
    private Operator op;
    private double weight;
    private double height;

    public CalculatorModel(){
    }

    public CalculatorModel(double num, double mem, Operator op, double weight, double height) {
        this.num = num;
        this.mem = mem;
        this.op = op;
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public Operator getOp() {
        return op;
    }

    public void setOp(Operator op) {
        this.op = op;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }
    
}
