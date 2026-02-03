package DZ5.BotanicalGarden;
/*
Объекты
Сад, орхидея, кактус


Свойсвта,действия

Сад
действие добавить растение
действие обеспечить уход

Кактус
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования

Орхидея
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования


Ростение(родительский класс)
поле - требуемое количество света
поле - требуемое количесво полива
действие показать требования

 */
public class Main {
    public static void main(String[] args) {

        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Cactus cactus = new Cactus();
        Orchid orchid = new Orchid();


        botanicalGarden.setNewPlant(cactus);
        botanicalGarden.takeCareOfPlant();

        System.out.println();

        botanicalGarden.setNewPlant(orchid);
        botanicalGarden.takeCareOfPlant();
    }
}
