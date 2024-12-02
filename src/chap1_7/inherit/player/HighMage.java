package chap1_7.inherit.player;

public class HighMage extends Mage{  //오류가 나는 경우는 Mage의 기본생성자가 없기 때문 기본생성자: public Mage(){}
   public HighMage(String nickName){
       super(nickName);
   }
}
