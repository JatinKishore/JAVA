package OOPS.Projects.LibraryProject;

class libraryContents{
    private int ID;
    private String title;
    private String author;
    public boolean availabilty;
    private int returnDate;

    libraryContents(int ID,String title, String author,int returnDate){
        this.ID =ID;
        this.title = title;
        this.author = author;
        this.returnDate = returnDate;
    }
    void setID(int ID){
        this.ID  = ID;
    }
    int getID(){
        return this.ID;
    }
    void setAuthor(String author){
        this.author  = author;
    }
    String getAuthor(){
        return this.author;
    }

    void setTitle(String title){
        this.title = title;
    }

    boolean getAvailabilty(){
        return this.availabilty;
    }

    void setAvailabilty(boolean availabile){
        this.availabilty = availabile;
    }
    public int getReturnDate(){
        return returnDate;
    }
}

class Book extends libraryContents{
    private int NoPages;

    Book(int ID, String title, String author,int returnDate,int NoPages){
        super(ID,title,author,21);
        this.NoPages = NoPages;
    }
}
class Magazine extends libraryContents{
    private int DateOfPublication;

    Magazine(int ID, String title, String author,int returnDate, int DateOfPublication){
        super(ID,title,author,7);
        this.DateOfPublication = DateOfPublication;
    }



}class DVD extends libraryContents{
    private int runTime;

    DVD(int ID, String title, String author,int returnDate, int runTime){
        super(ID,title,author,14);
        this.runTime = runTime;

    }
}
class LibraryCatalog{
    libraryContents Obj;
    LibraryCatalog(libraryContents o ){
        this.Obj  = o;
    }
    void checkout(){
        Obj.setAvailabilty(false);
        System.out.println("The ID of the libraryItem is "+ Obj.getID());
        System.out.println("This needs to be returned in "+Obj.getReturnDate());
    }
    void returns(){
        Obj.setAvailabilty(true);
        System.out.println("The returned of the libraryItem is "+ Obj.getID());
    }
}
public class Main
{
    public static void main(String[] args) {
        DVD dvd = new DVD(1,"WWE","Roman Lesnar",14,120);
        LibraryCatalog user1 = new LibraryCatalog(dvd);
        user1.checkout();
        user1.returns();
    }
}
