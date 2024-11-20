package chap1_2;


public class DataType {

    public static final double DOUBL = 3.14;

    //    메인 메서드: 프로그램의 실행 기점
    public static void main(String[] args) {
        int i = 20;
        double pi = 3.14;
        char c = '가';  //한글자 만 char
        String greeting = "안뇽!!"; //String은 앞에 대문자
        boolean flag = true;    // Ctrl + Alt  + v 를 사용시 데이터 타입에 맞게 나타남

        //정수 타입(byte: 1byte, short: 2byte, int: 4byte, long:8byte)
        // 1byte == 8bit  => 0 1111111
        byte x1 = 127;    //byte 는 -128 ~ 127 까지만 저장 가능
        // 2byte == 16bit => 0 1111111 11111111
        short x2 = 32767;    //byte 는 -128 ~ 127 까지만 저장 가능
        int x3= 2147483647;

        //10; // 리터럴: 변수에 저장되기 전 데이터
        // 정수 리터럴의 기본타입 int
        long x4 = 9223372036854775807L;
        System.out.println(x4);
        
            //===실수 타입 =====//
        float f1 = 3.142131231231232F;  //4byte
        double f2 = 3.142131232312132423; //8byte
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        //=====논리 타입===========//
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 <5;
        boolean b4 = (10 + 3 == 13) &&(9 * 1 == 8);

        // ==========문자와 문자열 타입=======/
        char c1 = 'A';//2byte
        char c2 = 44512;
        System.out.println("c2=" + c2);

        char[] cArray ={'h','e','l','l','o'};
        String str = new String(cArray);
        System.out.println("str=" + str);

        String s2 = "안녕하세요";
        System.out.println("s2=" + s2);


        // 자바 17부터 지원
        String s3 = """
                안녕
                ㅇㄹㅇㄹ
                ㄹㅇㄹㅇ
                """;
        // 동적 타이핑
        var z = 100; //타입 추론
        var h = "dsfdf";

    }
}
