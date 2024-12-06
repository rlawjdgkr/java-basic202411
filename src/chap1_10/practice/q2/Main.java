package chap1_10.practice.q2;

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("책먹는여우","김철수",5.6);
        PrintedBook printedBook = new PrintedBook("규철이","이규철",56);
        ebook.displayInfo();
        printedBook.displayInfo();
    }
}
