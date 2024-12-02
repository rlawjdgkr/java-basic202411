package chap1_7.inherit.example.car;

public class ElectricCar extends Car{

    private double batteryCapacity;

    public ElectricCar(String make, String model, int year , double batteryCapacity ) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start() {
        System.out.println(make+ model + "전기차가 조용히 시동을 겁니다.");
    }
    void displayRange(){
        System.out.println("예상 주행 거리: " + (batteryCapacity * 5) + "km");
    }
}
