package chap1_9.static_;

public class Count {
    //접근제한자(access modifier) - 클래스, 필드, 메서드 ,생성자
    //사용제한자(usage modifier)
    //static
    //final
    //abstract

    //정적 필드는 모든 객체가 공유하는 데이터다.
    static int x;   // 정적 필드
    int y;          // 인스턴스 필드

    //정적 메서드 : 모든 객체가 공유하는 기능 , 객체 생성없이 호출 가능
    // 특정 대상이 없기 때문에 this가 없다.
    static void m1(){
        System.out.println("static method call!");
    }
    // 인스턴스 메서드 : 객체별로 따로따로 행동하는 기능 , 호출시 객체생성이 필요
    void m2(){
        System.out.println("static method call!");
        System.out.println(this);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
