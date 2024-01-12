/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author XUAN LINH
 */
public class Candidate {
    private int candidateID;
   private String firstName;
   private String lastName;
   private String birthDate;
   private String address;
   private String phoneNumber;
   private String email;

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   public void displayInfo(){
       System.out.println("ID: "+candidateID);
       System.out.println("Ho Ten: "+ firstName +" "+lastName);
       System.out.println("Ngay sinh: "+birthDate);
       System.out.println("Dia Chi: "+address);
       System.out.println("Dien Thoai: "+phoneNumber);
       System.out.println("Email:"+email);
   }
}

