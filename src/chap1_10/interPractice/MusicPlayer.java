package chap1_10.interPractice;

public abstract class MusicPlayer {

    protected String songTitle;

    public MusicPlayer(String songTitle){
        this.songTitle = songTitle;
    }

    public void play(){}
    public void stop(){}

}
