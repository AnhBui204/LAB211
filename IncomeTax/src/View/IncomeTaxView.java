
package View;

public class IncomeTaxView{
        
    public void head(){
        System.out.println("-----Information-----");
        System.out.println("Tong thu nhap: ");
    }
    
    public void under18(){
        System.out.println("So tre em duoi 18 tuoi: ");
    }
    
    public void study18(){
        System.out.println("So tre em tren 18 tuoi di hoc: ");
    }
    
    public void nonStudy18(){
        System.out.println("So tre em tren 18 tuoi khong di hoc: ");
    }
    public void fatherInfo(){
        System.out.println("---Parent info---");
        System.out.println("Nhap tuoi bo: ");
    }
    public void motherInfo(){
        System.out.println("Nhap tuoi me: ");
    }
    public void parent(int count){
        System.out.println("So luong cha me du dieu kien: " + count);
    }
    
    public void broSis(){
        System.out.println("So luong anh chi em: ");
    }
    
    public void taxable(int taxableIncome){
        System.out.println("Thu nhap khi chiu thue: " + taxableIncome);
    }
    
    public void paid(int tax){
        System.out.println("Thue phai tra: " + tax);
    }
    
}