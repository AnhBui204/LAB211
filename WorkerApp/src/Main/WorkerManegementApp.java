/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.WorkerController;
import View.WorkerView;

/**
 *
 * @author XUAN LINH
 */
public class WorkerManegementApp {
    public static void main(String[] args) {
    WorkerController controller=new WorkerController();
    WorkerView view= new WorkerView(controller);
    view.run();
    }
}
