

public class Bookmanagement
{
   
   static int totalbooks;
    static {
        totalbooks=0;
    }
    {
        totalbooks++;
    }
    String title;
    String author;
    String isbn;  
    boolean isborrowed;  
    Bookmanagement(String isbn, String title, String author)
    {
      this.isbn=isbn;
      this.title=title;
      this.author=author;
    }
    Bookmanagement(String isbn)
    {
        this(isbn, "unknown", "unknown");
    }
     void borrowbooks()
    {
       if(isborrowed)
       {
        System.out.println("The book is borrowed");
       }
       else
       {
        this.isborrowed=true;
        System.out.println("Book issued to you");
       }
    }
     void returnbooks()
    {
      if(isborrowed)
      {
        this.isborrowed=false;
        System.err.println("The book has been returned");
      } 
      else{
        System.out.println("This book is in library");
      } 
    }
     static int getTotalbooks()
    {

        return totalbooks;
    }
    public static void main(String[] args) {
        Bookmanagement mybook1 = new Bookmanagement("1", "Ncert", "CBSE");
        Bookmanagement mybook2 = new Bookmanagement("2");
        System.out.println(Bookmanagement.getTotalbooks());
        mybook1.borrowbooks();
        mybook2.borrowbooks();
        mybook1.borrowbooks();  
        mybook1.returnbooks();
        mybook2.borrowbooks();
        mybook1.returnbooks();
    }

}