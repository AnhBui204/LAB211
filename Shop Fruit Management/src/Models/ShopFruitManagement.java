package Models;

public class ShopFruitManagement {
    private int fruitID, quantity;
    private String fruitName, origin;
    private double price;

    public ShopFruitManagement() {
    }

    public ShopFruitManagement(int fruitID, int quantity, String fruitName, String origin, double price) {
        this.fruitID = fruitID;
        this.quantity = quantity;
        this.fruitName = fruitName;
        this.origin = origin;
        this.price = price;
    }

    public int getFruitID() {
        return fruitID;
    }

    public void setFruitID(int fruitID) {
        this.fruitID = fruitID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShopFruitManagement{" + "fruitID=" + fruitID + ", quantity=" + quantity + ", fruitName=" + fruitName + ", origin=" + origin + ", price=" + price + '}';
    }
    
    
    
}
