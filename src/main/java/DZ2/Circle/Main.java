package DZ2.Circle;

public class Main {
    public static void main(String[] args){

        Circle circ1 = new Circle(9);

        circ1.setRadius(10);

        System.out.println( "Площадь: " + circ1.calculateArea());
        System.out.println( "Длина окружности: " + circ1.calculateCircumference());
    }
}
