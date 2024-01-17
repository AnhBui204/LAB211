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
    
    public void addStudents(ArrayList<Students> listStudents, String ID, String name, String semester, String course){
        Students ls = new Students(ID, name, semester, course);
        listStudents.add(ls);
    }
    private  void UpdateStudent(Student student){
     System.out.println("Enter updated student details:");
        System.out.print("Student Name: ");
        String updatedName = sc.nextLine();
        System.out.print("Semester: ");
        int updatedSemester = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Course Name (Java/.Net/C/C++): ");
        String updatedCourse = sc.nextLine();

        student.setStudentName(updatedName);
        student.setSestemer(updatedSemester);
        student.setCourseName(updatedCourse);

        System.out.println("Student updated successfully!");
    }

    private  void deleteStudent(Student student) {
        studentlist.remove(student);
        System.out.println("Student deleted successfully!");
    }

    private  void generateReport() {
        if (studentlist.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        // Create a map to store the counts of each student and course combination
        ArrayList<String> report = new ArrayList<>();

        for (Student student : studentlist) {
            String key = student.getStudentName() + "|" + student.getCourseName();
            if (!report.contains(key)) {
                report.add(key);
            }
        }
}
