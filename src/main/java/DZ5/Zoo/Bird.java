package DZ5.Zoo;

public class Bird extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Птица чирикает");
    }

    @Override
    public void move(){
        System.out.println("Птица летает");
    }
}
