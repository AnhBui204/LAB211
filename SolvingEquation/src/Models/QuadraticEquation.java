package Models;

import Controllers.Validation;
import java.util.ArrayList;

public class QuadraticEquation extends Equation {

    private float a, b, c;
    private float x1, x2;
    private boolean solved;
    private Validation validator = new Validation();

    public QuadraticEquation() {
    }

    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }
    
    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    @Override
    public void calculate() {
        float delta = b * b - 4 * a * c;
        if (delta > 0) {
            x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
            x2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
            solved = true;
        } else if (delta == 0) {
            x1 = x2 = -b / 2 * a;
            solved = true;
        } else solved = false;
    }

    @Override
    public ArrayList<Float> getOddList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkOdd(a))  list.add(a);
        if(validator.checkOdd(b))  list.add(b);
        if(validator.checkOdd(c))  list.add(c);
        
        return list;
    }

    @Override
    public ArrayList<Float> getEvenList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkEven(a))  list.add(a);
        if(validator.checkEven(b))  list.add(b);
        if(validator.checkEven(c))  list.add(c);
        
        return list;
    }

    @Override
    public ArrayList<Float> getPerfectSquareList() {
        ArrayList<Float> list = new ArrayList<>();
        if(validator.checkSquareNum(a))  list.add(a);
        if(validator.checkSquareNum(b))  list.add(b);
        if(validator.checkSquareNum(c))  list.add(c);
        
        return list;
    }
}
