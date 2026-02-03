package DZ5.Pet;

public class Cat extends Pet implements Playable {

    private String food = "влажный корм";



    @Override
    public void eat(){
        System.out.println("Кошка ест " + food);
    }

    @Override
    public void play(){
        System.out.println("Кошка играет");
    }
}
