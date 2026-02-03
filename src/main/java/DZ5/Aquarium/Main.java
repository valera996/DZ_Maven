package DZ5.Aquarium;
/*
Объекты: Аквариум, Акула, Морская звезда, Родительский класс Моркое сущесво


Свойства,дейсвтия:
Аквариум
действие добавить существо
дейсвтие показать поведение существа

Акула
дейсвтие плавает

Морская звезда
дествие медленно ползает

Родительский класс МорскоеСущесвто
действие двигаться




 */
public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        Starfish starfish = new Starfish();


        aquarium.setNewSeaAnimal(shark);
        aquarium.showBehavior();

        System.out.println();

        aquarium.setNewSeaAnimal(starfish);
        aquarium.showBehavior();
    }
}
