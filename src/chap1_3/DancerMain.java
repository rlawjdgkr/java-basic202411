package chap1_3;

//실행용 클래스: main메서드를 작성
public class DancerMain {
    public static void main(String[] args) {

        // 설계도(class)를 통해 객체(object)를 찍어낸다.
        // 클래스를 통해 인스턴스를 생성한다.
        // Dancer라는 배열에 string int 배열이 있기때문에 정확한 타입을 줄 수 없다 따라서 Dancer라는 형을 줌
        Dancer park= new Dancer();
        System.out.println("park = " + park);

        Dancer kim = new Dancer();
        System.out.println("kim = " + kim);

        //객체의 기능 사용 - 객체 참조 => 참조연산자 .
        park.dancerName = "박격포";
        park.crewName = "전쟁크루";
        park.danceLevel = 1;
        park.genres = new String[] {"힙합","스트릿", "코레오"};

        park.dance();
        kim.dance();


        Dancer gong = new Dancer("뽀로로");
        gong.dance();

        Dancer heartping = new Dancer("하츄핑","동방싱치");
        heartping.dance();
        heartping.introduce();

        Dancer merong
                = new Dancer("메롱롱" , "약오르지","케이팝","락킹","스트릿");
        merong.introduce();
    }
}
