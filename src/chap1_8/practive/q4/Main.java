package chap1_8.practive.q4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("사과는 열매다" , 10000);
        Electronics ele = new Electronics("전자레인지", 100000, 0.4);
        StoreManager sM = new StoreManager();

        sM.printProductPrice(book);
        sM.printProductPrice(ele);


    }
}
