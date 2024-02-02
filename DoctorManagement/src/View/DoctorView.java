package View;

import Model.Doctor;
import controller.DoctorController;

import java.util.ArrayList;

public class DoctorView extends Menu {

    private ArrayList<Doctor> doctors = new ArrayList<>();
    DoctorController a = new DoctorController();

    public DoctorView() {
        super(new String[]{"Add Doctor", "Update Doctor", "Delete Doctor", "Search Doctor" ,"Display All","Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                a.addDoctor();
                break;
            case 2:
                a.updateDoctor();
                break;
            case 3:
                a.deleteDoctor();
                break;
            case 4:
                a.searchDoctor();
                break;
            case 5:
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
