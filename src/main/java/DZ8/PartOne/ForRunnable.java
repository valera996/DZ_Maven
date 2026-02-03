package DZ8.PartOne;

public class ForRunnable {
    public static void main(String[] args) {

        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}
