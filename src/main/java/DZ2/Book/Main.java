package DZ2.Book;

public class Main {
    public static void main(String[] args){

        Book book1 = new Book("Идиот", "Пушкин");

        book1.setAuthor("Достоевский");

        book1.printInfo();
    }
}
