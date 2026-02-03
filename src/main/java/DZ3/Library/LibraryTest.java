package DZ3.Library;

public class LibraryTest {
    public static void main(String[] args) {

        Library lab1 = new Library();


        lab1.author = "укицук";

        //*показать, что `bookTitle` недоступен напрямую и задаётся только через сеттер/геттер;
        //Напряму нельзя поменять
        //lab1.BookTitle = "veveveqw";
        //Через сеттер можно
        lab1.setBookTitle("ыекрук");
        //Напрямую нельзя обратиться
        //System.out.println(lab1.BookTitle);
        //Через геттер можно
        System.out.println(lab1.getBookTitle());



        //* показать, что `year` (default) доступен
        // только в том же пакете (как у тебя сейчас) и его можно менять/читать;
        //Можно обратиться напрямую и поменять
        lab1.year = 2323;
        //Можно читать напрямую
        System.out.println(lab1.year);
        //Если попытаться обратиться к полю year из другого пакета, то будет ошибка компиляции

        //* показать, что `category` доступен отовсюду;
        //Можно обратиться напрямую и поменять
        lab1.category = "fefewfew";
        //Можно читать напрямую
        System.out.println(lab1.category);
        //Если попытаться обратиться к полю category из другого пакета, то не будет ошибки


        //* и напечатать результат, чтобы было видно, что всё реально работает.
        System.out.println("Название: " + lab1.getBookTitle());
        System.out.println("Автор: " + lab1.getAuthor());
        System.out.println("Год: " + lab1.getYear());
        System.out.println("Категория: " + lab1.getCategory());
    }


}
