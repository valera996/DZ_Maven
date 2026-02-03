package DZ2.Product;

public class Main {
    public static void main(String[] args) {

        Product prod1 = new Product("Колбаса", 600);

        prod1.applyDiscount(200);

        prod1.printInfo();
    }
}
