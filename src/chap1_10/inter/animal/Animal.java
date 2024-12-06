package chap1_10.inter.animal;

public abstract class Animal {
    //혹시나 필드를 상속내리고 싶을 떄
    //모든 동물들의 속성을 interface로 변경하고 남은 이부분에는 필드속성을 정의하면 된다 cause: interface는 필드를 내릴 수 없기때문
    String kind;
    int age;
}
