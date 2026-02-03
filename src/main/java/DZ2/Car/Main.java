package DZ2.Car;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car("BMW",1996);

        car1.print();

        car1.setBrand("Москвич");
        car1.print();
    }
}
