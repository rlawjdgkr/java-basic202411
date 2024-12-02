package chap1_7.inherit.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        ScientificCalculator scien = new ScientificCalculator();

        System.out.println("두개의 정수 합"+ cal.add(1,2));
        System.out.println("세개의 정수 합" +cal.add(3,4,6));
        System.out.println("두개의 실수 합" + cal.add(3.4,5.4));

        System.out.println("지수 승 계산" +scien.power(3,4));
    }
}
