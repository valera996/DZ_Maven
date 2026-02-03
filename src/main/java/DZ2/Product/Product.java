package DZ2.Product;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }


    public void setPrice(int price){
        this.price = price;
    }

    public int applyDiscount(int x){
        return this.price = this.price - x;
    }

    public void printInfo(){
        System.out.println("Название товара: " + getName() + ", цена: " + getPrice());
    }

}
