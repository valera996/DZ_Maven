package DZ5.AmusementPark;
/*
Объекты
Парк, Американские горки, Карусель

Свойства, действия:

Парк
действие добавить аттракцион
дейсвтие показать информацию посетителю
дейсвтие обслужить аттракцион

Американские горки
действие показать требование
действие показать инфу о себе

Карусель
действие показать требование
действие показать инфу о себе

Аттракцион(родительский класс)
действие показать требование
действие показать инфу о себе



 */
public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();
        RollerCoaster rollerCoaster = new RollerCoaster();
        Carousel carousel = new Carousel();



        amusementPark.setNewAttraction(rollerCoaster);
        amusementPark.showInfoForVisitor();
        amusementPark.maintainTheAttraction();

        System.out.println();

        amusementPark.setNewAttraction(carousel);
        amusementPark.showInfoForVisitor();
        amusementPark.maintainTheAttraction();
    }
}
