package chap1_10.inter;

public class AudioPlayer implements MediaPlayable{
    @Override
    public void Play() {
        System.out.println("오디오를 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("오디오를 pause합니다");
    }

    @Override
    public void stop() {
        System.out.println("오디오를 정지합니다");
    }
}
