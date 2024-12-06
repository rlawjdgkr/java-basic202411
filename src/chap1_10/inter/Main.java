package chap1_10.inter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();
    }
}
