package DZ5.Aquarium;

public class Aquarium {

    private SeaAnimal seaАnimal;

    public void setNewSeaAnimal(SeaAnimal seaAnimal){
        this.seaАnimal = seaAnimal;
    }

    public void showBehavior(){
        seaАnimal.move();
    }
}
