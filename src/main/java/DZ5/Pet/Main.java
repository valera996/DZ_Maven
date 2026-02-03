package DZ5.Pet;
/*объекты:
Система управления питомцем, кошка, собака и родительсий класс Питомец для них

Сойства,дейсвтия:

Кошка
поле еда
действие Играть
действие есть
свойство влажный корм корм

Собака
поле еда
действие Гулять
действие есть
свойство сухой корм

Система управления питомцем
действие добавить питомца (для этого нужно поле Питомец)
действие взаимодействие с ним

Родительский класс:

метод есть

Интерфейс:
метод играть

Интерфейс:
метод гулять
 */

public class Main {
    public static void main(String[] args){

        PetSystem petSystem = new PetSystem();

        Dog dog = new Dog();
        Cat cat = new Cat();

        petSystem.setNewPet(dog);
        petSystem.feedPet();
//        petSystem.walkWithPet();
//        petSystem.playWithPet();
        petSystem.walkWithPet(dog);

        //для отступа в консоли
        System.out.println();

        petSystem.setNewPet(cat);
        petSystem.feedPet();
//        petSystem.playWithPet();
//        petSystem.walkWithPet();
        petSystem.playWithPet(cat);

    }
}
