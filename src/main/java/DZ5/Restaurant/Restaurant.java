package DZ5.Restaurant;

public class Restaurant {

    private Dish dish;

    public void setNewDish(Dish dish){
        this.dish = dish;
    }

    public void showMenu(){
        dish.showCharacteristic();
    }
}
