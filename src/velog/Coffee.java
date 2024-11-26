package velog;
    //커피 클래스
public class Coffee {
    //필드(속성)
        String name;
        int price;

        //메서드(행동)
        void introduce(){
            System.out.printf(name+ "커피는" +price + "원 입니다");
        }

        public static void main(String[] args) {
            //coffee 클래스의 인스턴스 생성
            Coffee coffee1 = new Coffee();
            coffee1.name ="아메리카노";
            coffee1.price = 4500;

            coffee1.introduce();
        }

}
