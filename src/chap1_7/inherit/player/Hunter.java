package chap1_7.inherit.player;

public class Hunter extends Player {




    int concentrate; // 집중 게이지

    public Hunter(String nickname) {
        super(nickname);
        this.concentrate = 100;
    }

    // 상태정보를 확인하는 메서드

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("집중" + concentrate);
    }

    // 사냥꾼 스킬
    public void summonBeast() {

    }
}
