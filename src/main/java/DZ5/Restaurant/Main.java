package DZ5.Restaurant;

/*
Объекты: Ресторан, горячее, напиток, которые будут наследоваться от класса Блюдо

Свойства,действия:

Ресторан:
действие добавить блюдо
действие вывод информации о блюде

Горячее:
поле температура
действие показ информации

Напиток:
поле объем
действие показ информации

Родительский класс Блюдо:
действие показ информации


 */

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        HotDish hotDish = new HotDish(180);
        Drink drink = new Drink(0.5);

        restaurant.setNewDish(hotDish);
        restaurant.showMenu();

        System.out.println();

        restaurant.setNewDish(drink);
        restaurant.showMenu();
    }
}
