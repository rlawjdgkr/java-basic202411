package chap1_8.practive.q3;

public class Car extends Vehicle{
    private String make;
    private String model;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(make + model + "시동이 걸렸습니다");
    }

}
