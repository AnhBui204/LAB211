package Controller;

import Model.Doctor;
import View.DoctorView;
import View.Menu;

import java.util.ArrayList;

public class DoctorController extends Menu {

    private ArrayList<Doctor> doctors = new ArrayList<>();
    DoctorView a = new DoctorView();

    public DoctorController() {
        super(new String[]{"Add Doctor", "Update Doctor", "Delete Doctor", "Search Doctor" ,"Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                a.addDoctor();
                a.display();
                break;
            case 2:
                a.updateDoctor();
                a.display();
                break;
            case 3:
                a.deleteDoctor();
                a.display();
                break;
            case 4:
                a.searchDoctor();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice");

                break;
        }
    }
}
