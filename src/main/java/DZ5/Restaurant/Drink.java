package DZ5.Restaurant;

public class Drink extends Dish{

    private double volume;

    Drink(double volume){
        this.volume = volume;
    }


    @Override
    public void showCharacteristic(){
        System.out.println("Объём напитка " + volume);
    }
}
