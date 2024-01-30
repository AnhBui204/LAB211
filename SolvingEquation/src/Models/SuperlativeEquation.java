package Models;

import Controllers.Validation;
import java.util.ArrayList;

public class SuperlativeEquation extends Equation {

    private float a, b;
    private float x;
    private boolean solved;
    private Validation validator = new Validation();

    public SuperlativeEquation() {
    }

    public SuperlativeEquation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
    

    @Override
    public void calculate() {
        if (a != 0) {
            if (b != 0) {
                x = -b / a;
                solved = true;
            }
        } else solved = false;
        
    }
    
    @Override
    public ArrayList<Float> getOddList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkOdd(a))  list.add(a);
        if(validator.checkOdd(b))  list.add(b);
        
        return list;
    }

    @Override
    public ArrayList<Float> getEvenList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkEven(a))  list.add(a);
        if(validator.checkEven(b))  list.add(b);
        
        return list;
    }

    @Override
    public ArrayList<Float> getPerfectSquareList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkSquareNum(a))  list.add(a);
        if(validator.checkSquareNum(b))  list.add(b);
        
        return list;
    }

}
