package chap1_5.player;

public class Main {
    public static void main(String[] args) {
        Player shocking = new Player("충격왕쇼킹");
        Player insulting = new Player("욕설왕퍼킹");
        System.out.println("insulting = " + insulting);
        System.out.println("shocking = " + shocking);

        insulting.attack(shocking);
        insulting.attack(shocking);
        insulting.attack(shocking);
        insulting.attack(shocking);

    }
}
