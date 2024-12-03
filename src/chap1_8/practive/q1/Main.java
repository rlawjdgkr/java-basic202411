package chap1_8.practive.q1;

public class Main {
    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        Circle c1 = new Circle(6);
        Rectangle rec = new Rectangle(10, 30);


        shapeManager.printShapeInfo(c1);
        shapeManager.printShapeInfo(rec);
    }
}
