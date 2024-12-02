package chap1_7.super_;

public class Child extends Parent{

    public boolean c;

    public Child(){
        this(100); // this()를 사용하면 super() 호출되지 않는다. 하지만 public child(int X)를 타고 내려가면서 결국 super() 호출된다
        System.out.println("Child의 첫번째 생성자 호출");
    }
    public Child(int X){
//        super();
        System.out.println("Child의 두번째 생성자 호출");
    }
    public void subMethod(){
        System.out.println("child a = " + super.a);     //Child 클래스에서  int 와 double이 지정되어 있지 않으면 this나 super로 해도 상관 없지만
                                                        // 스스로 가지고 있느 경우에는 this를 사용 시 자신의 클래스에서 찾고 없을 시 상속된 부모의 this를 가져옴
        System.out.println("child b = " + super.b);
        System.out.println("child c = " + this.c);
    }

}
