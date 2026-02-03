package DZ9;

public class Counter {

//    4. Задача: использование synchronized
//    Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
//    Создайте два потока, каждый из которых вызывает increment() 1000 раз.
//    Обеспечьте правильную работу с помощью synchronized.

    public static int counter;
    public static synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                increment();
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
