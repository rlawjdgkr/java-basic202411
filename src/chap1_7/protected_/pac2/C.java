package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

public class C {

    void test(){
        A a = new A();
//        a.f1 = 10; //protected 접근 불가;
//        a.f2 = 20; //default 접근 불가   두개 공통점:다른 패키지에서 접근 불가
//        a.m1();
//        a.m2();

//        new A(1); new A("ewq");

    }
}
