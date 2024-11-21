package chap1_2;

import org.w3c.dom.ls.LSOutput;

public class Casting {
    public static void main(String[] args) {


    //타입 캐스팅
    //타입이 다르면 연산이 불가능

    // 묵시적 형 변환 : 작은 데이터를 큰 데이터에 대입하면 자동변환

    byte  a= 100;
    int b= a;
        System.out.println("b = " + b);
    // 큰 데이터를 작은 공간에 넣을 때는 명시적으로 변환을 해야 함.

    // 1의 보수 : 비트를 반전
    // 11010000 -> 0010111
    // 2의 보수 : 1을 더함
    // 0010111
    // +     1
    // 0011000 -> 24

   int c= 1000; //4byte
   byte d =(byte) c ; //1byte
        System.out.println("d = " + d);
        
        //결론: 큰데이터를 작은공간에 대입하면 데이터 손실 가능성이 잇음
        int k = 50; //4byte: 정수
        double j = k; // 8byte : 실수
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n);

        //묵시적 형변환 -> upcasting(promotion)
        //명시적 형변환 -> downcasting

        //타입이 다른 연산의 경우 큰쪽에 맞춰서 자동 캐스팅

        int v = 9;
        double z = 6.6;
        double result = v + z;
        char result2 = (char) ('A' + v);

        System.out.println("result2 = " + result2);

        double result3 = 27 / 5.0;
        System.out.println("result3 = " + result3);

        // int 보다  작은 데이터의 연산은 모두 강제로 int로 변환됨
        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 + b2;
        // char + char == int

        int i = 'A' + 'B';

    }
}
