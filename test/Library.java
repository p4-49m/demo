
public class Library {

    private Book[] books;
    private int bookCount;

    public Library(){
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook (Book book){

    try{
        if(book.getTitle().length() > 100){
            System.out.println("Error: the maximum is 100 charaters for the book title. ");   
            return;
        }
        
            books[bookCount] = book;
            bookCount++;
            System.out.println("Books added sucessfully");
        } catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Error" + e.getMessage());
           System.exit(0);
}

    }
    

    public void ShowAllBooks(){
        if (bookCount ==  0){
            System.out.println("Library is empty");
            return;

        }
        if (bookCount > 0){
            for (int i = 0; i < bookCount; i++){
                System.out.println("-" + books[i].getTitle());
            }

        }
        
    }

}   
    
    

