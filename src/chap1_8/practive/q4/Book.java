package chap1_8.practive.q4;

public class Book extends Product{
    public String title;
    public double price;

    public Book(String title, double price){
        this.title = title;
        this.price  = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
