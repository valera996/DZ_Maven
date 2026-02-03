package DZ7.ExceptionTasks;

public class SecondTask {

//    public static int divide(int firstNumber, int secondNumber) {
//        return firstNumber / secondNumber;
//    }


    public static void divide(int firstNumber, int secondNumber) {
        try {
           int result = firstNumber / secondNumber;
            System.out.println("Ответ " + result);
        }catch (ArithmeticException e){
            System.out.println("Ошибка! На ноль делить нельзя!");
        }
    }

    public static void main(String[] args) {

//        try{
//            int result = divide(10,5);
//            System.out.println("Ответ " + result);
//        }catch (ArithmeticException e){
//            System.out.println("Ошибка деления на ноль");
//        }
//        }

        divide(10,2);

    }
}
