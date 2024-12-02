package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

// protected: 다른 패키지의 접근을 차단, 단 상속관계에 있다면 부분적으로 허용

public class D extends A {
//    void test(){
//        A a = new A(100);
//    }
    //상속관계가 있으면 보통 private 대신 protected 사용한다 그게 아니면 일반적으로  필드는 대부분 private

    D(){
//        super("hello"); // 부모의 생성자를 호출  , default는 super생성자로 부모를 불러와도 되지 않음
        super(123);    //protected 는 호출 된다
        this.f1 = 10;
//        this.f2 = 30;
        m1();
//        m2();
    }
}
