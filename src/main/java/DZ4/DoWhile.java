package DZ4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        //positiveNumber();
        //chekPassword();
        //tenNumber();
        //scannerForExit();
        //numberCounter();

    }

    //Запрос положительного числа
    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int scannerNumber;

        do{
            System.out.print("Введите число: ");
            scannerNumber = scanner.nextInt();
        }while (scannerNumber <= 0);

        System.out.println("Число " + scannerNumber + " положительное");
    }

    //Проверка пароля
    public static void chekPassword(){
        Scanner scanner = new Scanner(System.in);
        String password = "555р";
        String scannerPassword;

        do{
            System.out.print("Введите пароль: ");
            scannerPassword = scanner.nextLine();
        }while(!scannerPassword.equals(password));
        System.out.println("Пароль верный");

    }

    //Вывод чисел от 1 до 10 с использованием do-while
    public static void tenNumber(){
        int firstNumber = 1;

        do{
            System.out.println(firstNumber);
            firstNumber++;
        }while(firstNumber <= 10);
    }

    //Завершение программы по команде "exit"
    public static void scannerForExit(){
        Scanner scanner = new Scanner(System.in);
        String scannerComand;

        do{
            System.out.print("Введите команду: ");
            scannerComand = scanner.nextLine();
        }while (!scannerComand.equals("exit"));

        System.out.println("Вы вышли из программы");
    }

    //Подсчёт количества цифр в числе
    public static void numberCounter(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();
        int result = 0;
        do{
            scannerNumber = scannerNumber / 10;
            result++;
        }while (scannerNumber > 0);
        System.out.println("Число состоит из " + result + " цифр");
    }


}
