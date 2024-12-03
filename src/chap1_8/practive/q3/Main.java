package chap1_8.practive.q3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("포르쉐","타이칸");
        Motorcycle moto = new Motorcycle("야마하");
        VehicleManager vM = new VehicleManager();
        vM.startVehicle(car);
        vM.startVehicle(moto);
    }
}
