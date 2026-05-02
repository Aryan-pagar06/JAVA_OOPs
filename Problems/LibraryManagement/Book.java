public class Book extends LibraryItem
{
    private final String isbn;

    public Book(String isbn, String title) {
        super(title);
        this.isbn = isbn;
    }

    @Override
    public void display () {
        super.display();
        System.out.println("ISBN is = " + isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book ("001", "Maths");
        b1.display();
        b1.checkout(); //notice how checkout and display come from super class
        b1.display();
        b1.checkout();
        b1.returnItem();
        b1.display();
    }
}