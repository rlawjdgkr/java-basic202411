package chap1_3.practice;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(200 , 500);

        int area = rectangle.calculateArea();
        System.out.printf("넓이: %d" ,area);

        int peri = rectangle.calculatePerimeter();
        System.out.printf("둘레 : %d", peri);

    }
}
