package chap1_10.practice.q2;

public class Ebook extends Book {

    private  double fileSize;
    public Ebook(String title, String author ,double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("fileSize = " + fileSize);
    }
}
