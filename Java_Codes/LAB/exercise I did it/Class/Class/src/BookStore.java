import java.util.ArrayList;

// I suggest seen modifier


public class BookStore{
    public ArrayList<Book> books= new ArrayList<>(); 
    public void addBook(String isbn, String title, String type,double price)
    {
        Book b = new Book(isbn, title, type, price);
        books.add(b);
        System.out.print(b.isbn + " ");
        System.out.print(b.title + " ");
        System.out.print(b.type + " ");
        System.out.print(b.price + " ");
        System.out.println();
    }
}



class Book {
    public String isbn;
    public String title;
    public String type;
    public double price;
    public Book(String isbn, String title, String type, double price)
    {
        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }
    public static void main(String[] args) {
        BookStore bs = new BookStore();
        // bs.books.add(new Book("2432", "Com Pro 2", "Dev", 3.57));
        // ArrayList<Book> bb = bs.books;
        // System.out.println(bb.get(0).title);
        // System.out.println(bb.get(0).type);
        // System.out.println(bb.get(0).price);

        
        bs.addBook("2432", "Com Pro 2", "A", 1);
        bs.addBook("34323123", "Com Pro ", "B", 2);
        bs.addBook("14324535", "Com Pro 1", "C", 3);
        bs.addBook("6432", "Com Pro 3", "D", 4);
    }
}



