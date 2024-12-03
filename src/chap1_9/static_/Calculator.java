package chap1_9.static_;

public class Calculator {
    String color;
    static double pi;

    // 계산기에 커스텀 색상을 추가하는 메서드
    void customColorize(){
        this.color = color;
    }
    // 원의 넓이를 계산하는 메서드
    static double calcArea(int r){
        return pi * r * r;
    }
}
