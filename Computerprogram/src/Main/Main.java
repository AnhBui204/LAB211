/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.CaculatorController;
import Model.CaculatorModel;
import View.CaculatorView;

/**
 *
 * @author XUAN LINH
 */
public class Main {
    public static void main(String[] args) {
        CaculatorModel model = new CaculatorModel();
        CaculatorView view = new CaculatorView();
        CaculatorController controller = new CaculatorController(model, view);

        controller.ProcessUserInput();
    }
}
