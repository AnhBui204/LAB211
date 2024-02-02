package View;

import Model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorView{

    
    private ArrayList<Doctor> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addDoctor() {
        System.out.println("Enter Doctor details:");

        String code;
        do {
            System.out.println("Enter Doctor Code (DOCxx):");
            code = sc.nextLine().toUpperCase().trim();
        } while (!isValidFormat(code));

        System.out.println("Doctor name: ");
        String docName = sc.nextLine().trim();
        System.out.println("Specialization:");
        String specialization = sc.nextLine().trim();
        System.out.println("Availability: ");
        int availability = sc.nextInt();
        sc.nextLine();
        Doctor doc = new Doctor(code, docName, specialization, availability);
        list.add(doc);

        System.out.println("Student created successfully!");
    }

    private boolean isValidFormat(String code) {
        if (code.matches("DOC\\d{2}")) {
            return true;
        } else {
            System.out.println("Invalid code. Please enter in the format DOCxx.");
            return false;
        }
    }

    public void searchDoctor() {
        String Code;
        do {
            System.out.println("Enter code to search Doctor: ");
            Code = sc.nextLine().toUpperCase();
        } while (!isValidFormat(Code));
        Doctor foundDoctor = findDoctorByCode(Code);

        if (foundDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }
        System.out.println(foundDoctor);
    }

    public void display() {
        System.out.printf("%-10s | %-15s | %-20s | %-5s\n", "DocCode", "DocName", "Specialization", "Availability");
        for (Doctor doc : list) {
            System.out.printf("%-10s | %-15s | %-20s | %-5s\n",
                    doc.getCode(), doc.getDocName(),
                    doc.getSpecialization(), doc.getAvailability());
        }
    }

    public void deleteDoctor() {
        System.out.println("Enter doctor code to find:");
        String code = sc.nextLine();

        Doctor foundDoctor = findDoctorByCode(code);

        if (foundDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }
        list.remove(foundDoctor);
        System.out.println("Doctor has been removed.");
    }

    public void updateDoctor() {
        System.out.println("Enter doctor code to find:");
        String code = sc.nextLine();

        Doctor foundDoctor = findDoctorByCode(code);

        if (foundDoctor == null) {
            System.out.println("Doctor not found.");
            return;
        }
        System.out.println("Enter updated doctor details:");
        System.out.println("Doctor name: ");
        String updateName = sc.nextLine().trim();
        System.out.println("Specialization:");
        String updateSpecialization = sc.nextLine().trim();
        System.out.println("Availability: ");
        int updateAvailability = sc.nextInt();
        sc.nextLine();

        foundDoctor.setDocName(updateName);
        foundDoctor.setSpecialization(updateSpecialization);
        foundDoctor.setAvailability(updateAvailability);

    }

    private Doctor findDoctorByCode(String code) {
        for (Doctor doc : list) {
            if (doc.getCode().equalsIgnoreCase(code)) {
                return doc;
            }
        }
        return null;
    }
}
