package DZ12.Task5;

public class Product {
    private String name;
    private String category;
    private int price;

    public Product(String category, String name, int price){
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
