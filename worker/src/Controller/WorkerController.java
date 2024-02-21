package Controller;

import View.WorkerView;
import View.Menu;

public class WorkerController extends Menu {

    WorkerView a = new WorkerView();

    public WorkerController() {
        super(new String[]{"Add Worker", "Increase salary", "Decrease salary","Display worker have been adjusted salary","Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                a.addWorker();
                break;
            case 2:
                a.increaseSalary();
                break;
            case 3:
                a.decreaseSalary();
                break;
            case 4:
                a.display();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid choice");

                break;
        }
    }
}