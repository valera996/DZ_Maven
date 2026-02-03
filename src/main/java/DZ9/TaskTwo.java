package DZ9;

public class TaskTwo {

//    2. Задача: создание двух потоков
//    Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B",
//    каждый по 5 раз с небольшой задержкой.

    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            for(int i = 0; i < 5; i++){
                System.out.println("A");
                try{Thread.sleep(500);}catch(InterruptedException e){}
            }
        });
        Thread t2 = new Thread(() ->{
            for(int i = 0;i < 5; i++){
                System.out.println("B");
                try{Thread.sleep(500);}catch(InterruptedException e){}
            }
        });

        t1.start();
        t2.start();
    }
}
