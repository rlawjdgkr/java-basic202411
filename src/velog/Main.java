package velog;


import chap1_4.cake.Apple;

public class Main {
    public static void main(String[] args) {

        Coffee kim = new Coffee("라떼","핀란드");    //이름과 지역만 초기화한 생성자 메인클래스
        kim.display();
        Coffee park = new Coffee("대한민국","루왁",4000);  //모두 초기화한 생성자 메인클래스
        park.display();
        Coffee lee = new Coffee(2000,"아프리카"  );
        lee.display();

    }
}
