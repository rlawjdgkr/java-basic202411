package chap1_9.practice.q1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("링컨",2018);
        Car car2 = new Car("토요타",2018);
        Car car3 = new Car("맥라렌",2018);
        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();

        Car.getTotalCars();
    }
}
