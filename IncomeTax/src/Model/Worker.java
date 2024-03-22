package Model;

public class Worker extends Parent {

    public int duoi18;  //So luong tre < 18
    public int hoc18;  //So luong tre > 18 dang hoc
    public int khonghoc18;  //So luong tre > 18 khong hoc
    public int broSis; //So luong anh chi em
    public int numOfParent; //So luong ba me gia > 60 tuoi

    public Worker() {
    }

    public Worker(int duoi18, int hoc18, int khonghoc18, int broSis, int numOfParent) {
        this.duoi18 = duoi18;
        this.hoc18 = hoc18;
        this.khonghoc18 = khonghoc18;
        this.broSis = broSis;
        this.numOfParent = numOfParent;
    }

    public Worker(int num, int age) {
        super(num, age);
    }

    public int getYounger() {
        return duoi18;
    }

    public void setYounger(int younger) {
        this.duoi18 = younger;
    }

    public int getStudent() {
        return hoc18;
    }

    public void setStudent(int student) {
        this.hoc18 = student;
    }

    public int getNoStudy() {
        return khonghoc18;
    }

    public void setNoStudy(int noStudy) {
        this.khonghoc18 = noStudy;
    }

    public int getBroSis() {
        return broSis;
    }

    public void setBroSis(int broSis) {
        this.broSis = broSis;
    }

    public int getNumOfParent() {
        return numOfParent;
    }

    public void setNumOfParent(int numOfParent) {
        this.numOfParent = numOfParent;
    }
    

    @Override
    public String toString() {
        return "Worker{" + "duoi18=" + duoi18 + ", hoc18=" + hoc18 + ", khonghoc18=" + khonghoc18 + ", broSis=" + broSis + ", numOfParent=" + numOfParent + '}';
    }

    public int taxableIncome(int TotlaIncome, Worker a) {
        int taxableIncome = 0, deductions = 0;
        int count = 0;
        while (count <= 2) {
            if (a.getYounger() >= 2) {                      //TH1
                int deduction = 2 * 4400000;
                deductions += deduction;
                break;
            } else {
                int deduction = a.getYounger() * 4400000;   //TH2
                deductions += deduction;
                count += a.getYounger();
            }
            if (a.getStudent() != 0) {                      //TH3
                int deduction = (2 - count) * 6000000;
                deductions += deduction;
                break;
            }
        }

        deductions += a.getNumOfParent() * 4400000 / (a.getBroSis() + 1);

        taxableIncome = TotlaIncome - deductions - 11000000;
        return taxableIncome;
    }

    public int tax(int taxableIncome, int TotlaIncome) {
        int tax = 0;
        int money = taxableIncome;
        if (TotlaIncome <= 11000000) {
            return 0; // Trả về 0 vì không có thuế cho thu nhập dưới 11 triệu VND
        }
        if (money <= 4000000) {
            tax = (int) (money * 0.02); // Tính thuế 2% cho khoảng thu nhập dưới 4 triệu VND
        } else if (4000000 < money && money <= 6000000) {
            tax = (int) (4000000 * 0.02 + (money - 4000000) * 0.05); // Tính thuế 5% cho khoảng thu nhập từ 4 đến 6 triệu VND
        } else if (6000000 < money && money <= 10000000) {
            tax = (int) (4000000 * 0.02 + 2000000 * 0.05 + (money - 6000000) * 0.1); // Tính thuế 10% cho khoảng thu nhập từ 6 đến 10 triệu VND
        } else if (money > 10000000) {
            tax = (int) (4000000 * 0.02 + 2000000 * 0.05 + 4000000 * 0.1 + (money - 10000000) * 0.2); // Tính thuế 20% cho thu nhập trên 10 triệu VND
        }

        return tax;
    }

}
