package DZ3.Library;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getCategory(){
        return this.category;
    }
    public int getYear(){
        return this.year;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }


}
