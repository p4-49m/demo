public class testLibrary {
    public static void main(String[] args) {
        Library L1 = new Library();
        Library L2 = new Library();

        PrintedBook PB1 = new PrintedBook("The Handsome Spy", "James Bond", 2012, 100);
        PrintedBook PB2 = new PrintedBook("The Running Man & Dog", "John Wick", 2016, 20);

        EBook EB1 = new EBook("The Three Little Man", "Mr Bean", 2018, 5.34);
        EBook EB2 = new EBook("The Married Guy", "Mr Optimus", 2020, 10.34);

        System.out.println("Adding Books to Library 1");
        
        L1.addBook(PB1);
        L1.addBook(PB2);
        L1.addBook(EB1);
        L1.addBook(EB2);

        System.out.println("-".repeat (50));

        System.out.println("Show book in Library 1");
        L1.ShowAllBooks();

        System.out.println("Show book in Library 2");
        L2.ShowAllBooks();
    }


}
