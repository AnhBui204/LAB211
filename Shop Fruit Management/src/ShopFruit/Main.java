package ShopFruit;

public class Main {
    
    public static void main(String[] args) {
        String[] choices = {"Create fruit", "View orders", "Shopping", "Exit"};
        new FruitShopView("Shop Fruit Management",choice).run();
    }
}
