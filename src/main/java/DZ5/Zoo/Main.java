package DZ5.Zoo;


//объекты: зоопарк, птица,слон
//свойства,действия:

//птица:
//действие летает
//действие чирикает

//слон:
//действие ходит
//действие трубит

//зоопарк
//действие добавить животное
//для этого нужно поле Животное
//действие показать повдение животного

//родительский класс для птицы и слона: Животные с двумя абстрактными методами


public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Elephant elephant = new Elephant();
        Bird bird = new Bird();

        zoo.setNewAnimal(elephant);

        zoo.showAnimalBehavior();


        zoo.setNewAnimal(bird);
        zoo.showAnimalBehavior();
    }
}
