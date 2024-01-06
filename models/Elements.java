package models;
import controllers.Validation;
import java.util.Scanner;

public class Elements {
    private static Scanner sc = new Scanner(System.in);
    
    private int[] array;
    private int size;
    
    public Elements(){
        System.out.print("Enter size of array: ");
        size = new Validation().getInt();
        array = new int[size];    
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            System.out.print("Elements " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Elements.sc = sc;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int[] getArray(){
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    public void display(){
        System.out.println("Your array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
