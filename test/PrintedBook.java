public class PrintedBook extends Book{
    
    private int numberOfPages;
    
    public PrintedBook(String title, String author,int yearPublished, int numberOfPages){
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public String toString(){
        return super.toString() + ", Num Pages :" + numberOfPages;
    }

}
