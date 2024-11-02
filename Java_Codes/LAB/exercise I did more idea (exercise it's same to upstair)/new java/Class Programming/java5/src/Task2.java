import java.util.ArrayList;

class Book{
    public String isbn;
    public String title;
    public String type;
    public double price;

    public Book(String isbn, String title, String type, double price){
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }

}

class BookStore{
    public ArrayList<Book> books = new ArrayList<>();
    void addBook(String isbn, String title, String type, double price){
        Book b = new Book(isbn, title, type, price);
        books.add(b);
    }
}

public class Task2 {
    public static void main(String[] args) throws Exception {
        Book b = new Book("2432", "Com Pro 2", "Dev", 3.57);
        b.title = "Silpakorn Sci";
        System.out.println(b.isbn);
        System.out.println(b.title);
        System.out.println(b.type);
        System.out.println(b.price);
    }
}
