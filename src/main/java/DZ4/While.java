package DZ4;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

            //factorial();
            //evenNumber();
            //countdown();

    }

    //Вычисление факториала с помощью while
    public static void factorial(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();
        int result = 1;
        int i = 1;

        while(i <= scannerNumber){
            result = result * i;
            i++;
        }
        System.out.println("Результат: " + result);
    }

    //Вывод всех чётных чисел до заданного
    public static void evenNumber(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();

        int i = 1;

        while(i <= scannerNumber){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Обратный отсчёт от введённого числа до 1
    public static void countdown(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();
        if(scannerNumber < 0){
            System.out.println("Отрицательные числа не принимаются,сорри");
        }
        while(scannerNumber > 0){
            System.out.println(scannerNumber);
            scannerNumber--;
        }
    }
}
