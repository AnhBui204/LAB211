
package Controller;

import Model.StudentModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentController {

    Scanner sc = new Scanner(System.in);
    ArrayList<StudentModel> student = new ArrayList<>();
    StudentModel a = new StudentModel();
    
    public void createStudent() {
        
        System.out.println("Enter student detail : ");
        System.out.print("Studnent Id:");
        a.setID(sc.nextInt());
        System.out.println("Student name:");
        a.setStudentName(sc.nextLine());
        System.out.println("Semester:");
        a.setSemester(sc.nextInt());
        System.out.println("Course name:");
        a.setCourseName(sc.nextLine());
        student.add(a);
    }

    public void findAndSortStudents() {
        
    }

    public void updateOrDeleteStudent() {
        
    }

    public void generateReport() {
        
    }
    
}
