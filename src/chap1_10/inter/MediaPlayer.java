package chap1_10.inter;

import javax.print.attribute.standard.Media;

public class MediaPlayer {
        //mediaList라는 배열을 생성 후 그 안에 MediaPlayable 배열을 넣음
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        //newMediaList라는 배열에 mediaList의 길이보다 큰 배열을 생성
        MediaPlayable[] newMediaList = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            newMediaList[i] = mediaList[i];
        }
        newMediaList[mediaList.length] = media;
        mediaList = newMediaList;
    }

    public void playAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.Play();
        }
    }
}
