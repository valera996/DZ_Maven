package DZ1;

public class MathOperations {

    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
        return x / y;
    }

    public static int findMax(int a, int b){
        return Math.max(a,b);
    }

    public static int difference(int x, int y){
        return Math.abs(x - y);
    }

    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds){
        return seconds / 60.0;
    }
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a*a + b*b);
    }
    public static double circleCircumference(double radius){
        return 2 * radius * Math.PI;
    }

    public static double calculatePercentage(double total, double part){
        if(total == 0){
            System.out.println("Total не может быть равен нулю");
        } return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c){
        return  c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] arg){

        System.out.println(add(1,8));
        System.out.println(subtract(6,5));
        System.out.println(multiply(3,2));
        System.out.println(divide(4,2));

        System.out.println(findMax(4,9));

        System.out.println(difference(5,9));

        System.out.println(squareArea(4));
        System.out.println(squarePerimeter(5));

        System.out.println(convertSecondsToMinutes(140));

        System.out.println(averageSpeed(40,20));

        System.out.println(findHypotenuse(2,4));

        System.out.println(circleCircumference(2));

        System.out.println(calculatePercentage(200,25));

        System.out.println(celsiusToFahrenheit(60));
        System.out.println(fahrenheitToCelsius(60));
    }
}
