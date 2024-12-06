package chap2_3.generic;


// 아직 정해지지 않은 바구니(뭐든 복제하는 generic)

// F를 담을 건데 F는 언제결정되느냐? 바구니가 만들어질떄 결정
public class Basket<F extends Fruit>{    //F는 Fruit의 자식 선언

    // F: 제네릭 타입 - 아직 설계당시에는 정확한 타입이 없는 상태

    private F fruit;

    public void setFruit(F fruit){
        this.fruit =  fruit;
    }
    public F getFruit(){
        return fruit;
    }
}
