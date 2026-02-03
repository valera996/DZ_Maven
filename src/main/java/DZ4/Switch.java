package DZ4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        //dayOfWeek();
        //ticketPrice();
        //letterMark();
        //commandExecution();
        //calculator();
    }


    //Вывод дня недели по номеру
    public static void dayOfWeek(){
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();

        switch(scannerNumber){
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Честверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Такого дня недели нет");

        }    }

    //Стоимость билета по дню недели
    public static void ticketPrice(){
        System.out.print("Введите номер дня недели: ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        int weekdayPrice = 300;
        int dayOfPrice = 450;

        switch(dayNumber){
            case 1, 2, 3, 4, 5 -> System.out.println("Стоимость билета в кино: " + weekdayPrice);
            case 6, 7 -> System.out.println("Стоимость билета в кино: " + dayOfPrice);
            default -> System.out.println("Кина не будет");
        }
    }

    //Перевод числовых оценок в буквенные (A–F)
    public static void letterMark(){
        System.out.print("Введите ваш балл: ");
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();

        if(point <= 100 && point >= 90){
            System.out.println("Оценка: А");
        }else if(point < 90 && point >= 80){
            System.out.println("Оценка: В");
        }else if(point < 80 && point>= 70){
        System.out.println("Оценка: C");
        }else if(point < 70 && point >= 60){
        System.out.println("Оценка: D");
        }else System.out.println("Оценка: F");

    }

    //Обработка текстовых команд
    public static void commandExecution(){
        System.out.print("Введите команду: ");
        Scanner scanner = new Scanner(System.in);
        String comand = scanner.nextLine();

        switch (comand){
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Статус системы 'всё чики-чики'");
            default -> System.out.println("Неизвестная команда");
        }

    }

    //Простой калькулятор с использованием switch
    public static void calculator(){
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Введите опертор: ");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();

        System.out.print("Введите второе число: ");
        Scanner scanner3 = new Scanner(System.in);
        int secondNumber = scanner3.nextInt();

        if(secondNumber == 0 && operator.equals("/")){
            System.out.println("Делить на ноль нельзя");
        }
        else{

            int result;
            switch (operator) {
                case "+" -> {
                        System.out.print("Результат равен: ");
                        System.out.println(result = (firstNumber + secondNumber));
                }
                case "-" -> {
                    System.out.print("Результат равен: ");
                    System.out.println(result = (firstNumber - secondNumber));
                }
                case "*" -> {
                    System.out.print("Результат равен: ");
                    System.out.println(result = (firstNumber * secondNumber));
                }
                case "/" -> {
                    System.out.print("Результат равен: ");
                    System.out.println(result = (firstNumber / secondNumber));
                }default -> System.out.println("Такая операция не обрабатывается,сорри");


            }
        }
    }

}
