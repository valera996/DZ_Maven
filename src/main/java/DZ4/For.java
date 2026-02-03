package DZ4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //divisibleNumber();
        //sumOfDigits();
        //multiplicationTable();
        //simpleNumber();
        //tenNumber();
    }

    //Вывод чисел от 1 до 100, делящихся на 3
    public static void divisibleNumber(){
        int x = 100;

        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0 ){
                System.out.println(i);
            }
        }
    }

    //Сумма чисел от 1 до n
    public static void sumOfDigits(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <=number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Таблица умножения для числа
    public static void multiplicationTable(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }

    //Проверка на простое число
    public static void simpleNumber(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
              isPrime = false;
              break;
            }

        }
        System.out.println("Число " + number + " простое - " +isPrime );
    }

    //Вывод чисел от 1 до 10
    public static void tenNumber(){

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
