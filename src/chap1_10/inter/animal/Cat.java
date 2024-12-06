package chap1_10.inter.animal;

public class Cat implements Wild,Pet{
    @Override
    public void handle() {

    }

    @Override
    public boolean inject() {
        return false;
    }

    @Override
    public void violent() {

    }


    // 난폭한 행동

    //애완동물로 키울 수 있음

    //사냥 불가
}
