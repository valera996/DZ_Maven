package DZ5.Museum;
/*

Объекты
Музей, Манускрипт, Скульптура

Свойства, дейсвтия

Музей
дейсвтие добавить экспонат
действие уход за экспонатом
дейсвтие показ информации об экспонате


Манускрипт
поле информация о манускрипте
поле требования
действие показать инфу о себе
действие показать требования

Скульптура
поле информация о скультптуре
поле требования
действие показать инфу о себе
действие показать требования


Экспонат
действие показать инфу о себе
действие показать требования
 */
public class Main {
    public static void main(String[] args) {

        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();


        museum.setnNewExhibit(manuscript);
        museum.showInfoForVisitors();
        museum.maintainTheExhibit();

        System.out.println();

        museum.setnNewExhibit(sculpture);
        museum.showInfoForVisitors();
        museum.maintainTheExhibit();
    }
}
