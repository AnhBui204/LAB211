package Controller;

import Model.Model;
import View.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processGarbageCollection() {
        int[] garbageAtStations = view.getInputGarbageAtStations();
        for (int garbage : garbageAtStations) {
            model.addGarbage(garbage);
        }
        model.returnToStation();
        double totalCost = model.calculateTotalCost();
        view.displayTotalCost(totalCost);
        view.closeScanner();
    }
}
