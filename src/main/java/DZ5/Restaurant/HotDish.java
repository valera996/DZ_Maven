package DZ5.Restaurant;

public class HotDish extends Dish{

    private int temperature;

    HotDish(int temperature){
        this.temperature = temperature;
    }



    @Override
    public void showCharacteristic(){
        System.out.println("Температура блюда " + temperature);
    }
}
