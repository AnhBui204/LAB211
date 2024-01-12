
package model;

public class InternCandidate extends Candidate {
    private String major;
    private int semester;
    private String university;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Chuyen Nganh: "+major);
        System.out.println("Hoc Ky: "+semester);
        System.out.println("Truong dai hoc: "+university);
        System.out.println("====================");
    }
}
