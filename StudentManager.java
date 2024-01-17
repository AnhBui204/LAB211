/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modal.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author XUAN LINH
 */
public class StudentManager {
    private static final ArrayList<Student> studentlist=new ArrayList();
    private static final Scanner sc = new Scanner(System.in);
public static void PrintMenu(){
    System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Please choose (1-5): ");
}
private static void CreateStudent(){
    System.out.println("Enter student details:");
    System.out.println("Student name: ");
    String studentName=sc.nextLine();
    int semester=sc.nextInt();
    System.out.println("Course name(Java/.net/C/C++): ");
    String CourseName=sc.nextLine();
    Student student = new Student(studentName, semester, CourseName);
    studentlist.add(student);
    System.out.println("Student created successfully!");
    if (studentlist.size() > 10) {
            System.out.print("Do you want to continue (Y/N)? ");
            String continueOption = sc.nextLine().trim();
            if (!continueOption.equalsIgnoreCase("Y")) {
                return;
}
    }
}
private static void FindandSortStudent(){
     if (studentlist.isEmpty()) {
        System.out.println("No students available.");
        return;
    }
     System.out.println("Enter keyword to find student: ");
     String keyword=sc.nextLine().trim().toLowerCase();
     ArrayList<Student> searchResults= new ArrayList();
     for( Student student : studentlist){
         if(student.getStudentName().toLowerCase().contains(keyword)){
             searchResults.add(student);
         }
         if(searchResults.isEmpty()){
             System.out.println("No matching studnet found: ");
             return;
         }
         Collections.sort(searchResults, new StudentComparator());
         System.out.println("Search Results (Sorted by Student Name):");
    System.out.println("ID\tStudent Name\tSemester\tCourse Name");
    for ( Student students : searchResults) {
        System.out.println(student.getId() + "\t" + student.getStudentName() + "\t\t"
                + student.getSestemer() + "\t\t" + student.getCourseName());
    }
     }
}
private static void UpdateStudent(Student student){
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

    private static void deleteStudent(Student student) {
        studentlist.remove(student);
        System.out.println("Student deleted successfully!");
    }

    private static void generateReport() {
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

        // Display the report
        System.out.println("Student Report:");
        System.out.println("Student Name\tCourse\tTotal Courses");

        for (String key : report) {
            String[] parts = key.split("\\|");
            String studentName = parts[0];
            String courseName = parts[1];

            int totalCourses = 0;

            for (Student student : studentlist) {
                if (student.getStudentName().equals(studentName) && student.getCourseName().equals(courseName)) {
                    totalCourses++;
                }
            }

            System.out.println(studentName + "\t\t" + courseName + "\t\t" + totalCourses);
        }
    }

}
