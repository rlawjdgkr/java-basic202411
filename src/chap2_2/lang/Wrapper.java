package chap2_2.lang;

public class Wrapper {
    private int a; //기본값 0
    private Integer b; //기본값 null

    public static void main(String[] args) {
        /*
            {
                value: 10
            }
         */
        // 자바는 객체지향 언어다.
        //Wrapper란 단순한 값들도 다 객체지향으로 바꾸는것
        //Wrpper의 목적: 원시타입을 제거하겠다.
        Byte x1 = 10;
        Short x2 = 10;
        Integer x3 = 10;
        Long x4 = 10L;
        Float x5 = 5.5F;
        Double x6 = 5.6;
        Boolean x7 = false;
        Character x8 = 'A';

        int a = 10;
        String s = new String(new char[] {'a','b','c'});
        //박싱: 빈번하게 쓰이는 객체들을 쉽게 쓸 수 있게 문법적으로 처리
        String str = "abc";

        Integer b = new Integer(10);
        System.out.println("b = " + b);

    }
}