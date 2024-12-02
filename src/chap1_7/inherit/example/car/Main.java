package chap1_7.inherit.example.car;

public class Main {
    public static void main(String[] args) {
        Car avante = new Car("현대", "아반떼", 2000);
        ElectricCar tesla = new ElectricCar("테슬라", "모델4", 2020,43500);

        avante.start();
        tesla.start();

        tesla.displayRange();
    }
}
