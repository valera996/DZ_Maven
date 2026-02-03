package DZ4;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        //sum();
        //numbersNotMultiplesOfThree();
        //positiveNumber();
        //commandScanner();
    }

    //Сумма чисел до первого отрицательного (использовать break)
    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int result;

        while(true){
            System.out.print("Введите первое число ");
            firstNumber = scanner.nextInt();
            System.out.print("Введите второе число ");
            secondNumber = scanner2.nextInt();
            if(firstNumber < 0 || secondNumber < 0){
                System.out.println("Вы ввели отрицательное число, пока-пока");
                break;
            }
            result = firstNumber + secondNumber;
            System.out.println("Сумма чисел равна " + result);
        }
    }

    //Пропуск чисел, делящихся на 3 (использовать continue)
    public static void numbersNotMultiplesOfThree(){

        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }else System.out.println(i);
        }
    }

    //Вывод только положительных чисел (использовать continue)
    public static void positiveNumber(){

        Scanner scanner = new Scanner(System.in);
        int scannerNumber;

        while(true){
            System.out.print("Введите число ");
            scannerNumber = scanner.nextInt();
             if(scannerNumber > 0 ){
                 System.out.println("Ваше число " + scannerNumber);
                 continue;
             }else if(scannerNumber < 0){
                 continue;
             }else break;
        }
    }

    // Ввод строк до команды "stop" (использовать break)
    public static void commandScanner(){
        Scanner scanner = new Scanner(System.in);
        String scannerComand;

        while (true){
            System.out.print("Введите команду ");
            scannerComand = scanner.nextLine();
            if(scannerComand.equals("stop")){
                System.out.println("Программа остановлена");
                break;
            }
        }
    }
}
