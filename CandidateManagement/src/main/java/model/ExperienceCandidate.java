/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author XUAN LINH
 */
public class ExperienceCandidate extends Candidate {
     private int expInyear;
    private String proSkill;

    public int getExpInyear() {
        return expInyear;
    }

    public void setExpInyear(int expInyear) {
        this.expInyear = expInyear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
     @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kinh Nghiem: "+ expInyear +"Nam");
        System.out.println("Ky Nang chuyen nghiep: "+proSkill);
        System.out.println("====================");
    }
}

