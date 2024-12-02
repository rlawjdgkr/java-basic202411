package chap1_7.inherit.example.car;

public class Car {
    public String make;
    public String model;
    public int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println(make+model+"자동차가 시동을 겁니다");
    }
}