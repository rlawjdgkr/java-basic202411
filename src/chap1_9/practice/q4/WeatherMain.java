package chap1_9.practice.q4;

public class WeatherMain {
    public static void main(String[] args) {
       Weather weather = Weather.SNOWY;
        System.out.println("현재날씨 : " + weather.getStatus());
        System.out.println("조언" + weather.getAdvice());
    }
}
