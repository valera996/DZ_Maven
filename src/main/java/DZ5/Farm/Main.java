package DZ5.Farm;
/*
Объекты: Ферма, Корова, Курица

Свойсвта,действия:

Ферма
дейсвтие добавить животное
действие кормить животное
действие собрать продукт

Корова
дейсвтие давать молоко
дейсвтие есть на выпасе

Курица
дейсвтие нести яйца
дейсвтие есть зерно


Интерфейс
метод двать продукт

Родительский класс ДомашнееЖивотное
метод есть


 */
public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();



        farm.setNewLiveStock(cow);
        farm.feedLiveStock();
        farm.takeProduct(cow);

        System.out.println();

        farm.setNewLiveStock(chicken);
        farm.feedLiveStock();
        farm.takeProduct(chicken);
    }
}
