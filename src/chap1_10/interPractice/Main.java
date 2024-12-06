package chap1_10.interPractice;

public class Main {
    public static void main(String[] args) {
        PlayerManager playerManager = new PlayerManager();

        MP3Player mp3 = new MP3Player("다비치");
        CDPlayer cdplay = new CDPlayer("거북이");

        playerManager.PlayMusic(mp3);
        playerManager.PlayMusic(cdplay);
    }
}
