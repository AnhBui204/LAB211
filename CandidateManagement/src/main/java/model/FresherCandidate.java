/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author XUAN LINH
 */
public class FresherCandidate extends Candidate {
     private String graduationDate;
     private String graduationRank;
     private String education;

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
     @Override
     public void displayInfo(){
         super.displayInfo();
         System.out.println("Ngay Tot Nghiep: "+graduationDate);
         System.out.println("Xep loai tot nghiep: "+graduationRank);
         System.out.println("Truong Dai Hoc:"+education);
         System.out.println("========================");
     }
    
}

