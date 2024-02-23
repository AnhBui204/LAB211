/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controller.DictionaryController;
import Model.DictionaryModel;
import View.DictionaryView;

/**
 *
 * @author XUAN LINH
 */
public class DictionaryManagement {
    public static void main(String[] args) {
        DictionaryModel model = new DictionaryModel();
        DictionaryView view = new DictionaryView();
        DictionaryController controller = new DictionaryController(model, view);

        while (true) {
            view.DisplayMenu();
            int option = Integer.parseInt(view.getInput());
            controller.run(option);
        }
    }
}

