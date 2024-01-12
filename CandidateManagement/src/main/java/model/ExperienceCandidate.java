
package model;

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

