package chap1_3;

public class vehicleMain {
    public static void main(String[] args) {
        vehicle grandeur = new vehicle("그랜져");

        grandeur.powerOn();
        grandeur.powerOn();
        System.out.println("=====================");

        vehicle panamera = new vehicle("파나메라");
        panamera.powerOff();
        panamera.accelerate();
        panamera.accelerate();
        panamera.accelerate();

        grandeur.accelerate();
    }
}
