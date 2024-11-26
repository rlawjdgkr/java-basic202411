package chap1_5.car;

public class Car {
    String model; // 모델명
    String color; //색상
    int year; //제조 연도
    int mileage;// 주행 거리


    public Car(String model, String color) {
        this.model = model;
        this.color = color;

    }

    public Car(String model, String color, int year, int mileage) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    void drive(int distance){
        this.mileage += distance;
        System.out.printf("증가된 거리:%d 주행거리 %d \n ",distance,this.mileage);

    }
    void displayInfo(){
        System.out.println("모델" + this.model);
        System.out.println("색상" + this.color);
        System.out.println("연도" + this.year);
        System.out.println("주행거리" + this.mileage);

    }
}
