package chap1_10.inter;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void Play() {
        System.out.println("이미지가 재생됩니다");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 pause됩니다");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 멈춥니다");
    }
}
