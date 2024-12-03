package chap1_9.practice.q1;

public class Car {
    private String mode;
    private int year;
    static int count;

    public Car(String mode, int year) {
        this.mode = mode;
        this.year = year;
        count ++;
    }
    public void getCarInfo(){
        System.out.println("모델명 : "+this.mode);
        System.out.println("제조년도 = " + year);
    }
    public static void getTotalCars(){
        System.out.println("총 생산 갯수 : "+ count);

    }

}
