package DZ2.Rectangle;

public class Main {
    public static void main(String[] args){

        Rectangle rect1 = new Rectangle(5,6);

        rect1.setWidth(4);

        System.out.println(rect1.calculateArea());
    }
}
