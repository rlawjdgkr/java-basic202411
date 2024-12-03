package chap1_8.practive.q3;

public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String type){
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println(type + "오토바이의 시동이 걸렸습니다");
    }
}
