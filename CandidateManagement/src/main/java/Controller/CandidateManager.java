
package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Candidate;
import model.ExperienceCandidate;
import model.FresherCandidate;
import model.InternCandidate;

public class CandidateManager {
    private ArrayList<ExperienceCandidate> experienceCandidates;
    private ArrayList<FresherCandidate> fresherCandidates;
    private ArrayList<InternCandidate> internCandidates;

    public CandidateManager() {
        experienceCandidates = new ArrayList<>();
        fresherCandidates = new ArrayList<>();
        internCandidates = new ArrayList<>();
    }
    
     private void displayMainMenu(){
         System.out.println("HE THONG QUAN LY UNG VIEN");
         System.out.println("1. Experience");
         System.out.println("2.Fresher");
         System.out.println("3.Intern");
         System.out.println("4.Search");
         System.out.println("5.Exit");
         System.out.println("Vui long chon chuc nang(1-5): ");
     }
     private void inputCandidateinfo(Candidate candidate){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap ID ung vien: ");
         candidate.setCandidateID(sc.nextInt());
         System.out.println("Nhap ten: ");
         candidate.setFirstName(sc.next());
         System.out.println("Nhap Ho: ");
         candidate.setLastName(sc.next());
         System.out.println("Nhap ngay sinh: ");
         string birthDate=sc.next();
         while (!isValidBirthDate(birthDate)) {
        System.out.println("Ngày sinh không hợp lệ. Vui lòng nhập lại.");
        System.out.print("Nhập Ngày sinh (YYYY): ");
        
    }
         candidate.setBirthDate(sc.next());
         System.out.println("Nhap dia chi: ");
         candidate.setAddress(sc.next());
         System.out.println("Nhap dien thoai: ");
         String phoneNumber = sc.nextLine().trim(); 
         while (!isValidPhoneNumber(phoneNumber)) {
         System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
         System.out.print("Nhập Điện thoại: ");
         
         }
         candidate.setPhone(phoneNumber);
         System.out.println("Nhap email: ");
         String email = scanner.next();
         while (!isValidEmail(email)) {
        System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
        System.out.print("Nhập Email: ");
        email = scanner.next();
    }
         candidate.setEmail(sc.next());
     }
    private boolean isValidBirthDate(String birthDate) {
    int currentYear = java.time.Year.now().getValue();
    return birthDate.matches("^\\d{4}$") && Integer.parseInt(birthDate) >= 1900 && Integer.parseInt(birthDate) <= currentYear;
}

private boolean isValidPhoneNumber(String phoneNumber) {
    return phoneNumber.matches("^\\d{10,}$");
}

private boolean isValidEmail(String email) {
    return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
}
     private void displayAllCandidates(){
         System.out.println("=========UNG VIEN KINH NGHIEM========");
         for(ExperienceCandidate candidate :experienceCandidates){
             candidate.displayInfo();
         }
         System.out.println("========== UNG VIEN CHINH THUC=======");
         for(FresherCandidate candidate:fresherCandidates){
             candidate.displayInfo();
         }
         System.out.println("=========== UNG VIEN THUC TAP==========");
         for(InternCandidate candidate:internCandidates){
             candidate.displayInfo();
         }
     }
     private void createrExperienceCandidate(){
         Scanner sc= new Scanner (System.in);
         System.out.println("Nhap thong tin ung vien kinh nghiem: ");
         ExperienceCandidate experienceCandidate=new ExperienceCandidate();
         inputCandidateinfo(experienceCandidate);
         System.out.println("Nhap so nam kinh nghiem: ");
         experienceCandidate.setExpInyear((sc.nextInt()));
         System.out.println("Nhap ky nang chuyen nghiep: ");
         experienceCandidate.setProSkill(sc.next());
         experienceCandidates.add(experienceCandidate);
         System.out.println("Ban co muon tiep tuc (Y/N)? ");
         char continueChoice=sc.next().charAt(0);
         if(continueChoice !='Y' && continueChoice !='y'){
             displayAllCandidates();
         }
     }
      private void createFresherCandidate(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Nhap thong tin ung vien Fresher: ");
          FresherCandidate fresherCandidate= new FresherCandidate();
          inputCandidateinfo(fresherCandidate);
          System.out.println("Nhap ngay tot nghiep: ");
          fresherCandidate.setGraduationDate(sc.next());
          System.out.println("Nhap xep loai tot nghiep: ");
          fresherCandidate.setGraduationRank(sc.next());
          System.out.println("Nhap truong dai hoc: ");
          fresherCandidate.setEducation(sc.next());
          fresherCandidates.add(fresherCandidate);
          System.out.println("Ban co muon tiep tuc (Y/N)? ");
          char continueChoice=sc.next().charAt(0);
          if(continueChoice !='Y' && continueChoice !='y'){
             displayAllCandidates();
         }
      }
      private void createInternCandidate(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Nhap thong tin ung vien Intern: ");
          InternCandidate internCandidate= new InternCandidate();
          inputCandidateinfo(internCandidate);
          System.out.println("Nhap chuyen nganh: ");
          internCandidate.setMajor(sc.next());
          System.out.println("Nhap hoc ky: ");
          internCandidate.setSemester(sc.nextInt());
          System.out.println("Nhap ten truong dai hoc: ");
          internCandidate.setUniversity(sc.next());
          internCandidates.add(internCandidate);
          System.out.println("Ban co muon tiep tuc (Y/N)? ");
          char continueChoice=sc.next().charAt(0);
          if(continueChoice !='Y' && continueChoice !='y'){
             displayAllCandidates();
         }
         }
      private <T extends Candidate> void displaySearchedCandidates(ArrayList<T>candidates,String name){
          System.out.println("Cac ung vien nhan thay: ");
          for(T candidate:candidates){
              if(candidate.getFirstName().toLowerCase().contains(name.toLowerCase())||candidate.getLastName().toLowerCase().contains(name.toLowerCase())){
                 candidate.displayInfo();
          }
          }
      }
      private void searchCandidates(){
          Scanner sc= new Scanner(System.in);
          displayAllCandidates();
          System.out.println("Nhap Ten ung vien(Ten Hoac Ho): ");
          String name=sc.next();
          System.out.println("Loai dau vao cua ung vien(0-2): ");
          int CandidateType=sc.nextInt();
          switch(CandidateType){
              case 0:displaySearchedCandidates(experienceCandidates, name);
              break;
              case 1: displaySearchedCandidates(fresherCandidates, name);
              break;
              case 2:displaySearchedCandidates(internCandidates, name);
              break;
              default:
                  System.out.println("Ung vien khong hop le: ");
          }
      }
      public void runProgram(){
          Scanner sc=new Scanner(System.in);
          while(true){
              displayMainMenu();
              int choice=sc.nextInt();
              switch (choice){
              case 1:
                 createrExperienceCandidate();
                 break;
              case 2:
                 createFresherCandidate();
                 break;
              case 3:
                  createInternCandidate();
                  break;
              case 4:
                  searchCandidates();
                  break;
              case 5:
                  System.out.println("Chuong Trinh ket thuc.");
                  System.exit(0);
              default:
                  System.out.println("Lua chon khong hop le, Vui long chon lai.");
                  
          }
          }
      }
   }

