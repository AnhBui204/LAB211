package Controllers;

import Models.Students;
import java.util.ArrayList;

public class StudentController {
    
    public StudentController() {
    }
    ArrayList<Students> listStudents = new ArrayList<>();
    
    public void initiate(){
        listStudents.add(new Students("DE01", "Tran Trung Dung", "Spring", "Java"));
        listStudents.add(new Students("DE02", "Bui Le Viet Anh", "Summer", "C"));
        listStudents.add(new Students("DE03", "Nguyen Xuan Linh", "Fall", ".Net"));
        listStudents.add(new Students("DE04", "Le Van Thien", "Spring", "DBI"));
        listStudents.add(new Students("DE05", "Nguyen Nam Phong", "Spring", "Java"));
        listStudents.add(new Students("DE06", "Tran Thang Chi", "Fall", ".NET"));
        listStudents.add(new Students("DE07", "Tran Duc Long", "Summer", "DBI"));
        listStudents.add(new Students("DE08", "Nguyen Ba Anh Duc", "Fall", "C"));
        listStudents.add(new Students("DE09", "Hoang Trong Quang", "Summer", "DBI"));
        listStudents.add(new Students("DE10", "Hoang Nhat Minh", "Spring", ".NET"));
        
    }
    public void createStudents(String ID, String name, String semester, String course){
        
    }
    
    public void addStudents(ArrayList<Students> listStudents, String ID, String name, String semester, String course){
        Students ls = new Students(ID, name, semester, course);
        listStudents.add(ls);
    }
}
