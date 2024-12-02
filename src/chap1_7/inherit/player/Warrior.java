package chap1_7.inherit.player;

// 하위(자식) 클래스 - sub class
// 상위 클래스로부터 필드와 메서드를 상속받는 클래스

public class Warrior extends Player {  // extends로 상속을 주기

    //직업 개별 속성
    int rage; //분노 게이지

    public Warrior(String nickname) {
       //super() : 부모의 생성자 호출
        super(nickname);  //본인의 생성자를 부를 때는 this지만 부모의 생성자를 부를때는 super를 사용
        this.rage = 100;
    }
    // 상태정보를 확인하는 메서드



    //오버 라이딩: 부모가 물려준 메서드가 자식에게 적합하지 않아
    //자식이 고쳐서 쓰는 행위
    // 룰: 부모가 물려준 모양은(리턴타입 , 이름, 파라미터)은 유지해야 함
    @Override //안전하게 오버라이딩 할 수 있게 룰을 체크해줌
    public void showStatus() {
        super.showStatus();
        System.out.println("#분노" + rage);
    }
    // 개별 직업 기능
    // 전사 스킬
    public void dash(){

    }
}
