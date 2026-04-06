public class EBook extends Book{
    private double fileSizes;
    
    public EBook (String title, String author,int yearPublished, double fileSizes){
        super(title, author, yearPublished);
        this.fileSizes = fileSizes;

    }

    public double getFileSizes(){
        return fileSizes;
    }

    public void setFileSizes(double fileSizes){
        this.fileSizes = fileSizes;
    }

    public String toString(){
        return super.toString() + ", FileSizes :" + fileSizes;
    }
}
