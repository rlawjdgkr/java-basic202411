package chap1_7.inherit.player;

public class Main {
    public static void main(String[] args) {

        /*

         */
        Warrior warrior = new Warrior("주차왕 파킹");
        Mage mage = new Mage("충격왕 쇼킹");
        Hunter hunter = new Hunter("스티븐 호킹");

        warrior.showStatus();
        mage.showStatus();
        hunter.showStatus();

        System.out.println("==========================");

        mage.fireBall(hunter);
        mage.fireBall(warrior);
        mage.fireBall(mage);

        System.out.println("==============");
        mage.thunderbolt(warrior,hunter
                , new Mage("냠냠이")
                , new Hunter("원생이"),
                new Warrior("막띠려")

        );
    }
}
