
public class LibraryItem {

    protected  String title;
    private boolean isAvailable;

    public LibraryItem(String title) {
        this.isAvailable = true;
        this.title = title;
    }

    public void checkout() {
        if (isAvailable == true) {
            isAvailable = false;
            System.out.println("Item checked out");
        } 
        else {
            System.out.println("Item not available ");
        }
    }

    public void returnItem () {
      isAvailable = true;
      System.out.println("Item returned");
    }

    public void display () {
      if(isAvailable) {
      System.out.println("Item is available");
      System.out.println("Title : " + title);
      }
      else {
      System.out.println("Item is not available");
      System.out.println("Title : " + title);
      }
    }
}
