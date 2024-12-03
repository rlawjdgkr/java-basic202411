package chap1_8.practive.q1;

public class ShapeManager {

    public void printShapeInfo(Shape shape){
        System.out.println("면적" +shape.area());
        System.out.println("둘레" +shape.perimeter());
    }
}
