package chap1_10.interPractice;

public class MP3Player extends MusicPlayer {

    public MP3Player(String songTitle) {
        super(songTitle);
    }

    @Override
    public void play() {
        System.out.printf("MP3 플레이어에서 %s을 재생합니다",this.songTitle);
    }

    @Override
    public void stop() {
        System.out.printf("MP3 플레이어에서 %s를 멈춥니다" ,this.songTitle);
    }
}
