package View;

import Controller.StudentController;
import Controller.Validation;
import Model.StudentModel;

import java.util.ArrayList;

public class StudentView extends Menu {
    private ArrayList<StudentModel> students = new ArrayList<>();
    StudentController a = new StudentController();

    public StudentView() {
        super( new String[]{"Create", "Find and Sort", "Update/Delete", "Report", "Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                a.createStudent();
                break;
            case 2:
                a.findAndSortStudents();
                break;
            case 3:
                a.updateOrDeleteStudent();
                break;
            case 4:
                a.generateReport();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}