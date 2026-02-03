package DZ5.Pet;

public class Dog extends Pet implements Walkable {

    private String food = "cухой корм";



    @Override
    public void eat(){
        System.out.println("Собака ест " + food);
    }

    @Override
    public void walk(){
        System.out.println("Собака гуляет");
    }

}
