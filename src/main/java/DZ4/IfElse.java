package DZ4;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        //positiveNumber();
        //maxNumber();
        //makr();
        //parity();
        //discountCalculation();
        //resultOfTest();
    }
    //Определение знака числа
    public static void positiveNumber(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x == 0){
            System.out.println("Число равно нулю");
        }else if(x < 0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число положительное");
        }
    }
    //Поиск наибольшего из двух чисел
    public static void maxNumber(){
        System.out.print("Введите первоке число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();

        if(firstNumber > secondNumber){
            System.out.println(firstNumber +  " больше " + secondNumber);
        }else if(firstNumber < secondNumber){
            System.out.println(firstNumber + " меньше " + secondNumber);
        }else {
            System.out.println("Числа равны");
        }


    }

    //Вывод оценки по шкале 1–5
    public static void makr(){
        System.out.print("Введите оценку: ");
        Scanner scanner = new Scanner(System.in);
        int exempleMart = scanner.nextInt();

        if(exempleMart == 5){
            System.out.println("Ваша оценка 'Отлично'");
        }else if(exempleMart == 4){
            System.out.println("Ваша оценка 'Хорошо'");
        }else if(exempleMart == 3) {
            System.out.println("Ваша оценка 'Удовлетворительно'");
        }else if(exempleMart == 2 || exempleMart == 1){
            System.out.println("Ваша оценка 'Неудовлетворительно'");
        }else System.out.println("Такой оценки нет");
    }

    //Проверка на чётность
    public static void parity(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int exempleNumber = scanner.nextInt();

        if(exempleNumber % 2 == 0){
            System.out.println("Число " + exempleNumber + " четное");
        }else System.out.println("Число " + exempleNumber + " нечетное");
    }

//    Определение размера скидки по возрасту
    public static void discountCalculation(){
        System.out.print("Введите возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 18 && age > 0){
            System.out.println("Ваша скидка 25%");
        }else if(age >= 65){
            System.out.println("Ваша скидка 30%");
        }else if(age <= 0) {
            System.out.println("Вам пока нельзя покупать");
        } else  System.out.println("У вас нет скидки");

    }

//    Оценка результата теста по баллам
    public static void resultOfTest(){
        System.out.print("Введите ваш результат: ");
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();

        if(point >= 90){
            System.out.println("Отлично");
        }else if(point < 90 && point >= 75){
            System.out.println("Хорошо");
        }else if(point < 75 && point >=60){
            System.out.println("Удовлетворительно");
        }else System.out.println("Неудовлетворительно");
    }





}
