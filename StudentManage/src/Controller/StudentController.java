package controller;

import Model.Report;
import Model.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentController {

    private ArrayList<Students> listStudents = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void initiate() {
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

    public void createStudent() {
        System.out.println("Enter student details:");

        String id;
        do {
            System.out.println("Enter student ID (DExx):");
            id = sc.nextLine();
        } while (!isValidFormat(id));

        System.out.println("Student name: ");
        String studentName = sc.nextLine();
        System.out.println("Semester:");
        String semester = sc.nextLine();
        System.out.println("Course name (Java/.net/C/C++): ");
        String courseName = sc.nextLine();

        Students student = new Students(id, studentName, semester, courseName);
        listStudents.add(student);

        System.out.println("Student created successfully!");

        if (listStudents.size() >= 10) {
            System.out.print("Do you want to continue (Y/N)? ");
            String continueOption = sc.nextLine().trim();
            if (!continueOption.equalsIgnoreCase("Y")) {
                return;
            }
        }
    }

    private boolean isValidFormat(String id) {
        if (id.matches("DE\\d{2}")) {
            return true;
        } else {
            System.out.println("Invalid ID. Please enter in the format DExx.");
            return false;
        }
    }

    public void findAndSortStudent() {
        if (listStudents.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Enter keyword to find student: ");
        String keyword = sc.nextLine().trim().toLowerCase();
        ArrayList<Students> searchResults = new ArrayList<>();

        for (Students student : listStudents) {
            if (student.getStudentName().toLowerCase().contains(keyword)) {
                searchResults.add(student);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No matching student found.");
            return;
        }

        Collections.sort(searchResults, Comparator.comparing(Students::getStudentName));

        System.out.println("Search Results (Sorted by Student Name):");
        System.out.println("ID\tStudent Name\tSemester\tCourse Name");

        for (Students student : searchResults) {
            System.out.println(student.getID() + "\t" + student.getStudentName() + "\t\t"
                    + student.getSemester() + "\t\t" + student.getCourseName());
        }
    }

    public void updateStudent(Students student) {
        System.out.println("Enter updated student details:");
        System.out.print("Student Name: ");
        String updatedName = sc.nextLine();
        System.out.print("Semester: ");
        String updatedSemester = sc.nextLine();
        System.out.print("Course Name (Java/.Net/C/C++): ");
        String updatedCourse = sc.nextLine();

        student.setStudentName(updatedName);
        student.setSemester(updatedSemester);
        student.setCourseName(updatedCourse);

        System.out.println("Student updated successfully!");
    }

    public void deleteStudent(Students student) {
        listStudents.remove(student);
        System.out.println("Student deleted successfully!");
    }

    public void updateOrDeleteStudent() {
        System.out.println("Enter student ID to find:");
        String idToFind = sc.nextLine();

        Students foundStudent = findStudentById(idToFind);

        if (foundStudent == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Do you want to update (U) or delete (D) this student?");
        String choice = sc.nextLine().trim();

        if (choice.equalsIgnoreCase("U")) {
            updateStudent(foundStudent);
        } else if (choice.equalsIgnoreCase("D")) {
            deleteStudent(foundStudent);
        } else {
            System.out.println("Invalid choice. Returning to the main menu.");
        }
    }

    private Students findStudentById(String id) {
        for (Students student : listStudents) {
            if (student.getID().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    public void generateReport() {
        if (listStudents.isEmpty()) {
            System.out.println("List empty.");
            return;
        }

        ArrayList<Report> reportList = new ArrayList<>();

        for (Students student : listStudents) {
            String courseName = student.getCourseName();
            String studentName = student.getStudentName();

            boolean reportExists = false;

            for (Report report : reportList) {
                if (report.getStudentName().equalsIgnoreCase(studentName)
                        && report.getCourseName().equalsIgnoreCase(courseName)) {
                    report.setTotalCourse(report.getTotalCourse() + 1);
                    reportExists = true;
                    break;
                }
            }

            if (!reportExists) {
                reportList.add(new Report(studentName, courseName, 1));
            }
        }

        System.out.println("Student Report:");
        System.out.printf("%-15s|%-10s|%-7s\n", "Student Name", "Course Name", "Total");

        for (Report report : reportList) {
            System.out.printf("%-15s|%-10s|%-7d\n", report.getStudentName(), report.getCourseName(), report.getTotalCourse());
        }
    }

}
