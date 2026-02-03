package DZ8.PartOne;

public class ForMathOperation {
    public static void main(String[] args) {

        MathOperation sum = (x,y) -> x + y;
        System.out.println(sum.operation(3,4));


        MathOperation subtraction = (x,y) -> x - y;
        System.out.println(subtraction.operation(10,5));

        MathOperation divide = (x,y) -> x / y;
        System.out.println(divide.operation(12,6));

        MathOperation multiplication = (x,y) -> x * y;
        System.out.println(multiplication.operation(2,3));

    }
}
