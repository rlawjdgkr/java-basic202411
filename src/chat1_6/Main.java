package chat1_6;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();

        myCar.pressStartButton();

        myCar.setMode("D");
        System.out.println("변속 모드:" +myCar.getMode());
    }
}
