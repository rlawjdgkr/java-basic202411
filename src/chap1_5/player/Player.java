package chap1_5.player;

public class Player {
    //필드
    String nickName;
    int level;
    int hp;

            //매개 변수
    Player(String nickName){
        //this.는 오직 필드에만 붙일 수 있음
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //공격 기능
    void attack(Player targetPlayer){
        // 상대방의 체력이 10 감소하고
        // 내 체력이 5 감소
        System.out.println("this = " + this);
        System.out.println("targetPlayer = " + targetPlayer);
        targetPlayer.hp -= 10;
        this.hp -= 5;   //this 는 나의 체력

        System.out.printf("%s님이 %s님을 공격했습니다",this.nickName, targetPlayer.nickName);
        System.out.println("나의 현재 체력"+ this.hp);
        System.out.println("상대방의 체력" + targetPlayer.hp);
    }

}
