package DZ2.Laptop;

public class Laptop {
    private String brand;
    private int price;

    public Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }
    public int getPrice(){
        return this.price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Бренд: " + getBrand() + ", цена: " + getPrice());
    }
}
