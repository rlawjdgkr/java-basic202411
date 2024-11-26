package chap1_3.practice;

public class CarMain {

    public static void main(String[] args) {

        Car myCar = new Car("테슬라모델x", "실버");
        myCar.accelerate(30);
        myCar.accelerate(30);
        myCar.accelerate(30);
        myCar.brake(30);

        myCar.displaySpeed();
    }
}
