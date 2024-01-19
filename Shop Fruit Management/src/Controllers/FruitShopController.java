package Controllers;

import Model.Fruit;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitController {

    Scanner sc = new Scanner(System.in);
    ArrayList<ShopFruitManagement> fruitList = new ArrayList<>();

    public void createFruit() {
        Fruit a = new Fruit();
        System.out.println("---------Fruit detail---------");
        System.out.println("Enter fruit ID:");
        a.setFruitID(sc.nextLine());
        System.out.println("Enter fruit Name:");
        a.setFruitName(sc.nextLine());
        System.out.println("Fruit price:");
        a.setPrice(sc.nextInt());
        System.out.println("Fruit quantity:");
        a.setQuantity(sc.nextInt());
        System.out.println("Fruit origin:");
        a.setOrigin(sc.nextLine());
        sc.nextLine();

        fruitList.add(a);
    }
    public void Shopping(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Danh Sach Trai Cay: ");
        displayFruit();
        System.out.println("Ban da chon: ");
        int selectedFruitId=sc.nextInt();
        // tim trai cay duoc chon
        Fruit selectedFruit=null;
        for(Fruit fruit: fruits){
            if(fruit.getId()==selectedFruitId){
                selectedFruit=fruit;
                break;
            }
        }
        if(selectedFruit !=null){
            System.out.println("Vui long nhap so luong(con " + selectedFruit.getQuanity()+"Trai cay: ");
            int quanity=sc.nextInt();
            if(quanity>selectedFruit.getQuanity()){
                System.out.println("So luong trai cay khong du !");
                return;
            }
            System.out.println("Ban co muon dat hang hay khong (Y/N)");
            char choice=sc.next().charAt(0);
            if(choice == 'Y'||choice =='y'){
                double total= quanity * selectedFruit.getPrice();
                System.out.println("San Pham |So Luong |Gia|Tong Cong");
                System.out.println(selectedFruit.getName()+" "+quanity+" "+selectedFruit.getPrice()+"$"+total+"$");
                System.out.println("Nhap ten cua ban: ");
                String customerName=sc.next();
                //luu vao Hastable
                 ArrayList<Fruit> orderList = orders.getOrDefault(customerName, new ArrayList<>());
                orderList.add(new Fruit(selectedFruit.getId(), selectedFruit.getName(),
                        selectedFruit.getPrice(), quanity, selectedFruit.getOrgin()));
                orders.put(customerName, orderList);

                // Cập nhật số lượng trái cây còn lại trong cửa hàng
                selectedFruit.setQuanity(selectedFruit.getQuanity()- quanity );

                System.out.println("Đặt hàng thành công!");
            } else {
                System.out.println("Quay lại danh sách trái cây để tiếp tục đặt hàng.");
            }
        } else {
            System.out.println("Trái cây không tồn tại!");
        }
            }

    public void checkYN() {
    while (true) {
        System.out.println("Do you want to continue (Y/N)?");
        String input = sc.nextLine().trim();
        if (input.equalsIgnoreCase("y")) {
            createFruit();
        } else if (input.equalsIgnoreCase("n")) {
            display();
            return;
        } else {
            System.out.println("Invalid input. Please try again:");
        }
    }
}

    
    public void display(){
        System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s%n", "ID", "Fruit name", "Price", "Quantity", "Origin");
        for(Fruit fruit : fruitList){
            System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s%n", fruit.getFruitID(), fruit.getFruitName(), fruit.getPrice(),fruit.getQuantity(),fruit.getOrigin());
        }
    }

}
