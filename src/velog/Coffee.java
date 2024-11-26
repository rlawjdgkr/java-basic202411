package velog;
    //커피 클래스
public class Coffee {
    String name;
    String region;
    int price;

        public Coffee(String name, String region, int price) {
            this.name = name;
            this.region = region;
            this.price = price;
        }
        // 이름과 지역만 초기화 하는 생성자
        public Coffee (String name, String region){
            this(name,region,3000);
        }
        //가격과 지역만 초기화 하는 생성자
        public Coffee(int price, String region) {
//            this.name = "아메리카노";
//            this.price = price;
//            this.region = region;
            this("아메리카노",region, price);
        }

        void display(){
            System.out.println("name = " + name);
            System.out.println("region = " + region);
            System.out.println("price = " + price);
        }
    }
